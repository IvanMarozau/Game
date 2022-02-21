package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.Mapa;
import cz.mendelu.pjj.JavaGame2.Player;
import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class PlayerActor extends Actor {
    public Player player;
    private String color;
    PlayerActor(Player player,String color){
        this.player=player;
        this.color=color;
        drowPlayer();
    }

    public void drowPlayer(){
        var player1= new GreenfootImage(String.format("%s.png",color));
        player1.scale(15,15);
        setImage(player1);
    }

}
