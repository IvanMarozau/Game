package cz.mendelu.pjj.JavaGame2.Greenfoot;

import greenfoot.Actor;
import greenfoot.Greenfoot;
/**
 * @author xmarozau
 * @version etapa 4
 */
public abstract class StartButtons extends TextActor {
    public StartButtons(String text){
        super(text);
    }
    protected abstract void onClick();

    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)){
            onClick();
        }
    }
}
