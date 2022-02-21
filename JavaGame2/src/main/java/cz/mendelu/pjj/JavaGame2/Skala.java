package cz.mendelu.pjj.JavaGame2;

import java.util.Random;

public class Skala extends Lokace{
    private int level;
    Skala(int lokX, int lokY, TypLokace typ,Mapa mapa) {
        super(lokX, lokY, typ, mapa);
        int a=0;
        Random randNamber=new Random();
        a=randNamber.nextInt(6)+1;
        this.level=a;
    }

    public int getLevel() {
        return level;
    }
    /**
     * metoda, která porovnává úroveň hory a číslo na kostkách
     * @return true nebo false
     * @autor xmarozau
     */
    public boolean climb(){
        if(Player.hodKostkami()>this.level){
            return true;
        }else return false;
    }
}
