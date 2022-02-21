package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Hra;
import greenfoot.GreenfootImage;
import greenfoot.World;
import cz.mendelu.pjj.JavaGame2.Hra;
/**
 * Třída vytvoří herní menu a tlačítka: start game, exit.
 * @author xmarozau
 * @version etapa 4
 */

public class StartWorld extends World {
    private Hra hra;
    public StartWorld(){
        super(600,600,1);
        var image= new GreenfootImage("fonStart.jpeg");
        image.scale(600,600);
        setBackground(image);
        addObject(new StartHra(),290,230);
        addObject(new ExitButton(),290,260);

    }

}
