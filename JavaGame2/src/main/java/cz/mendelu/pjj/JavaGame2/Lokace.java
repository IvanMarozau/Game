package cz.mendelu.pjj.JavaGame2;

import java.io.Serializable;
import java.util.Objects;

public class Lokace implements Serializable {
    public int lokX;
    public int lokY;
    Player player;

    public TypLokace getTyp() {
        return typ;
    }

    TypLokace typ;
    Mapa mapa;
    Lokace(int lokX, int lokY, TypLokace typ,Mapa mapa){
        this.lokX=lokX;
        this.lokY=lokY;
        this.typ=typ;
        this.mapa=mapa;
    }
    public int getLokX(){
        return lokX;
    }
    public int getLokY(){
        return lokY;
    }
    /**
     * @autor xmarozau
     * @version etapa 3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lokace lokace = (Lokace) o;
        return lokX == lokace.lokX && lokY == lokace.lokY && Objects.equals(player, lokace.player) && typ == lokace.typ && Objects.equals(mapa, lokace.mapa);
    }
    /**
     * @autor xmarozau
     * @version etapa 3
     */
    @Override
    public int hashCode() {
        return Objects.hash(lokX, lokY, player, typ, mapa);
    }
    /**
     * @autor xmarozau
     * @version etapa 3
     */
    @Override
    public String toString() {
        return "Lokace{" +
                "lokX=" + lokX +
                ", lokY=" + lokY +
                ", player=" + player +
                ", typ=" + typ +
                ", mapa=" + mapa +
                '}';
    }
}
