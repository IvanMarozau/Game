package cz.mendelu.pjj.JavaGame2;

import java.io.*;

public class Hra implements Serializable {
     public Mapa mapa;
     public Player player;
     Hra() {
         this.mapa=new Mapa();
         this.player=new Player(0,0);
     }
     /**
      * Metoda na vytvoření nové hry.
      * Metoda vytvoří mapu a rozmístí na přílušných pozicích hráčů.
      * @return mapa ke hře.
      * @author xmarozau
      * @version etapa 2
      * @version etapa 3
      */
     public static Hra starthra(){
          Hra hra=new Hra();
          return hra ;
     }
     public Mapa getMapa(){
          return mapa;
     }
     /**
      * Save game to folder
      * @param hra
      * @param name name of file
      * @author xmarozau
      * @version etapa 4
      */
     public static void save(Hra hra, String name) {
          try (var out = new ObjectOutputStream(new FileOutputStream(file(name))))  {
               out.writeObject(hra);
          } catch (FileNotFoundException e) {
               e.printStackTrace();
          } catch (IOException e) {
               e.printStackTrace();
          }
     }
     private static File file(String name) {
          var dir = new File("save");
          if (!dir.exists()) {
               dir.mkdirs();
          }
          return new File(dir, name + ".JavaGame");
     }
     /**
      * Load game from save folder.
      * @param name name of file
      * @return loaded game
      * @author xmarozau
      * @version etapa 4
      */
     public static Hra load(String name) {
          try (var in = new ObjectInputStream(new FileInputStream(file(name))))  {
               return (Hra) in.readObject();
          } catch (FileNotFoundException e) {
               e.printStackTrace();
               throw new IllegalArgumentException("Load game failed.", e);
          } catch (IOException e) {
               e.printStackTrace();
               throw new IllegalArgumentException("Load game failed.", e);
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
               throw new IllegalArgumentException("Load game failed.", e);
          }

     }



}
