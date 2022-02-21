package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Hra;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import cz.mendelu.pjj.JavaGame2.Greenfoot.StartWorld;
import  cz.mendelu.pjj.JavaGame2.Greenfoot.HraWorld;
/**
 * Trida pro zobrazeni tlacitka start v hernim menu
 * @author xmarozau
 * @version etapa 4
 */
public class StartHra extends StartButtons {
    StartHra(){
        super("Start");
    }

    @Override
    protected void onClick() {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HraWorld());
        }
    }
}
