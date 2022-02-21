package cz.mendelu.pjj.JavaGame2;

public class Bazen extends Lokace{
    private int level;
    Bazen(int lokX, int lokY, TypLokace typ,Mapa mapa) {
        super(lokX, lokY, typ,mapa);
        this.level=Player.hodKostkami();
    }
}
