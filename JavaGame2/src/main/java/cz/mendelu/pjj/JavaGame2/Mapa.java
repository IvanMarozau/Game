package cz.mendelu.pjj.JavaGame2;

import java.io.Serializable;
import java.util.*;

public class Mapa implements Serializable {
    static String key(int sizeX, int sizeY) {
        return String.format("%s%d", sizeX, sizeY);
    }
    private static Map<String, Lokace> lokaces;
    Mapa(){
        final int sizeX=6;
        final int sizeY=6;
        lokaces= new LinkedHashMap<>();
        int pocKryst=0;
        int pocOhen=0;
       for(int i=0;i<sizeX;i++){
           for(int j=0;j<sizeY;j++){
               TypLokace typ= TypLokace.getRandomTyp();
                if(typ==TypLokace.KRYSTAL) {
                    if (pocKryst < 6) {
                        pocKryst++;
                        Lokace lok_0 = new Krystal(i, j, TypLokace.KRYSTAL, this);
                        lokaces.put(key(i, j), lok_0);
                    } else {
                        Lokace lok_5 = new Krystal(i, j, TypLokace.LES, this);
                        lokaces.put(key(i, j), lok_5);
                    }
                }
                if(typ==TypLokace.SKALA){
                    Lokace lok_1=new Skala(i,j,TypLokace.SKALA,this);
                    lokaces.put(key(i, j), lok_1);
                }if(typ==TypLokace.LES){
                    Lokace lok_2=new Lokace(i,j,TypLokace.LES,this);
                    lokaces.put(key(i, j), lok_2);
                }if(typ==TypLokace.OHEN ) {
                    if (pocOhen < 4) {
                        pocOhen++;
                        Lokace lok_3 = new Ohen(i, j, TypLokace.OHEN, this);
                        lokaces.put(key(i, j), lok_3);
                    } else {
                        Lokace lok_6 = new Ohen(i, j, TypLokace.LES, this);
                        lokaces.put(key(i, j), lok_6);
                    }
                }
                if(typ==TypLokace.BAZEN){
                    Lokace lok_4=new Bazen(i,j,TypLokace.BAZEN,this);
                    lokaces.put(key(i, j), lok_4);
                }
            }
        }
    }
    /**
     * Metoda pro získání políčka na mape.
     * @return Existující políčko
     * @autor xmarozau
     * @version etapa 2
     * @version etapa 3
     */
    public static Lokace getLokace(int lokX, int lokY){
        String key = key( lokX, lokY);
        if (!lokaces.containsKey(key)) {
            throw new IndexOutOfBoundsException(String.format("Square [%s,%d] not found.", lokX, lokY));
        }
        return lokaces.get(key);
    }
    /**
     * Metoda pro určení, jestli existuje pole o zadaných souřadnicích.
     * @param lokX
     * @param lokY
     * @return <code>true</code> pokud pole existuje
     * @author xmarozau
     */
    public static boolean existsLokace(int lokX, int lokY) {
        return lokaces.containsKey(key(lokX, lokY));
    }

    public static Map<String, Lokace> getLokaces() {
        return lokaces;
    }
}
