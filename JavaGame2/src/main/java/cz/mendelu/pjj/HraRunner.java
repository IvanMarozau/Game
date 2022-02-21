package cz.mendelu.pjj;

import bh.greenfoot.runner.GreenfootRunner;
import cz.mendelu.pjj.JavaGame2.Greenfoot.HraWorld;
import cz.mendelu.pjj.JavaGame2.Greenfoot.StartWorld;

public class HraRunner extends GreenfootRunner {
    static {
        bootstrap(HraRunner.class,
                GreenfootRunner.Configuration.forWorld(StartWorld.class)
                        .projectName("Hra cool")
                        .hideControls(true)
        );
    }

    public static void main(String[] args) {
        GreenfootRunner.main(args);
    }
}

