package cz.mendelu.pjj.JavaGame2;

import java.io.Serializable;
import java.util.*;

public class Player implements Serializable {
   private int pocetKrystal=0;
    private int aktualX;
    private int aktualY;



    public Player(int aktualX, int aktualY){
    this.aktualX=aktualX;
    this.aktualY=aktualY;
    }
    public int getAktualY() {
        return aktualY;
    }
    public int getAktualX(){
        return aktualX;
    }


    /**
     * metoda pro získání náhodného čísla na kostce
     * @return číslo na kostce
     * @autor xmarozau
     * @version etapa 2
     * @version etapa 3
     */
    public static int hodKostkami(){
        int a=0;
        Random randNamber=new Random();
        a=randNamber.nextInt(6)+1;
        return a;
    }


   public int addKrystal(){
        return pocetKrystal+1;
   }
    /**
     * Vrací seznam polí, kam se může player při hře pohnout.
     * @param pozX, pozY
     * @return Seznam dostopných poli
     * @author xmarozau
     * @version etapa 2
     * @version etapa 3
     */
   public Set<Lokace> canMove(int pozX, int pozY){
       Set<Lokace> result = new HashSet<>();
     if(Mapa.existsLokace(pozX-1,pozY)){
         result.add(Mapa.getLokace(pozX-1,pozY));
     }if(Mapa.existsLokace(pozX+1,pozY)) {
           result.add(Mapa.getLokace(pozX + 1, pozY));
       }if(Mapa.existsLokace(pozX,pozY-1)) {
           result.add(Mapa.getLokace(pozX , pozY-1));
       }if(Mapa.existsLokace(pozX,pozY+1)) {
           result.add(Mapa.getLokace(pozX , pozY+1));
       }

       return result;
   }
    /**
     * @autor xmarozau
     * @version etapa 3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return pocetKrystal == player.pocetKrystal && aktualX == player.aktualX && aktualY == player.aktualY;
    }
    /**
     * @autor xmarozau
     * @version etapa 3
     */
    @Override
    public int hashCode() {
        return Objects.hash(pocetKrystal, aktualX, aktualY);
    }
}
