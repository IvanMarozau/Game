package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Hra;
import cz.mendelu.pjj.JavaGame2.Player;
import greenfoot.Greenfoot;
/**
 * Trida pro zobrazeni tlacitka load
 * @author xmarozau
 * @version etapa 4
 */

public class LoadButton extends StartButtons{
    private Hra hra;
    private Player player;
    public LoadButton(Hra hra){
        super("Load Game");
        this.hra=hra;
    }

    @Override
    protected void onClick() {
        String name = Greenfoot.ask("Name of game: ");
        var hra = Hra.load(name);
        var world = new HraWorld(hra);
        Greenfoot.setWorld(world);
    }
}
