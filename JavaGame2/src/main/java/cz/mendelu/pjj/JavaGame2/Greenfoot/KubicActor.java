package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Player;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
/**
 * Trida  pro pohyb s kostkou a ukazuje ji v herním pole
 * @author xmarozau
 * @version etapa 4
 */

public class KubicActor extends Actor {
    public KubicActor(){
        drowKubic(1);
    }
    public void drowKubic(int a){
        if(a==1) {
            var kubic = new GreenfootImage("1.jpg");
            kubic.scale(45, 45);
            setImage(kubic);
        }if(a==2) {
            var kubic = new GreenfootImage("2.jpg");
            kubic.scale(45, 45);
            setImage(kubic);
        }if(a==3) {
            var kubic = new GreenfootImage("3.jpg");
            kubic.scale(45, 45);
            setImage(kubic);
        }if(a==4) {
            var kubic = new GreenfootImage("4.jpg");
            kubic.scale(45, 45);
            setImage(kubic);
        }if(a==5) {
            var kubic = new GreenfootImage("5.jpg");
            kubic.scale(45, 45);
            setImage(kubic);
        }if(a==6) {
            var kubic = new GreenfootImage("6.jpg");
            kubic.scale(45, 45);
            setImage(kubic);
        }
    }

    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)){
            onClick();
        }
    }
    public void onClick(){
        drowKubic(Player.hodKostkami());
    }
}
