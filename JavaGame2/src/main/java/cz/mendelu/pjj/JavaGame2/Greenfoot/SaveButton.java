package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Hra;
import cz.mendelu.pjj.JavaGame2.Player;
import greenfoot.Greenfoot;
/**
 * Trida pro zobrazeni tlacitka save
 * @author xmarozau
 * @version etapa 4
 */

public class SaveButton extends StartButtons{
    private Hra hra;

    public SaveButton(Hra hra){
        super("Save");
        this.hra=hra;


    }
    @Override
    protected void onClick() {
        String name = Greenfoot.ask("Name of game: ");
        Hra.save(hra,name);
    }
}
