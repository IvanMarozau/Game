package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Hra;
import cz.mendelu.pjj.JavaGame2.Player;
import greenfoot.Greenfoot;

public class MoveButton extends StartButtons {
    private Hra hra;
    public MoveButton(Hra hra){
        super("Move");
        this.hra=hra;
    }

    public static   int getA() {
        return a;
    }

    static int a=0;

    @Override
    protected void onClick() {
        a+=1;
    }
}

