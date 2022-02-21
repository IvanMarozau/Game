package cz.mendelu.pjj.JavaGame2.Greenfoot;

import greenfoot.Greenfoot;
/**
 * Trida pro ukončení hry.
 * @author xmarozau
 * @version etapa 4
 */
public class ExitButton extends StartButtons{
    public ExitButton(){
        super("Exit Game");
    }
    @Override
    protected void onClick() {
    if(Greenfoot.mouseClicked(this)){
        System.exit(0);
        }
    }
}
