package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Lokace;
import cz.mendelu.pjj.JavaGame2.Mapa;
import cz.mendelu.pjj.JavaGame2.TypLokace;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
/**
 * Třída zobrazují jednu lokace.
 * lokaсе se dělí na ohen, skala, les, krystal, bazen.
 * @author xmarozau
 * @version etapa 4
 */

public class LokaceActor extends Actor {
    private Lokace lokace;
    private PlayerActor playerActor;


    public LokaceActor(Lokace lokace) {
        this.lokace = lokace;
        drowLokace();
    }

    private void drowLokace() {
        if (Mapa.existsLokace(lokace.getLokX(), lokace.getLokY())) {
            if (lokace.getTyp() == TypLokace.KRYSTAL) {
                var krystal = new GreenfootImage("krystal.jpeg");
                krystal.scale(65, 65);
                setImage(krystal);
            }
            if (lokace.getTyp() == TypLokace.OHEN) {
                var ohen = new GreenfootImage("ohen.jpeg");
                ohen.scale(65, 65);
                setImage(ohen);
            }
            if (lokace.getTyp() == TypLokace.BAZEN) {
                var bazen = new GreenfootImage("bazen.jpeg");
                bazen.scale(65, 65);
                setImage(bazen);
            }
            if (lokace.getTyp() == TypLokace.LES) {
                var les = new GreenfootImage("les.jpeg");
                les.scale(65, 65);
                setImage(les);
            }
            if (lokace.getTyp() == TypLokace.SKALA) {
                var skala = new GreenfootImage("skala.jpeg");
                skala.scale(65, 65);
                setImage(skala);
            }
        }
    }

    public  Lokace getLokace() {
        return lokace;
    }


}
