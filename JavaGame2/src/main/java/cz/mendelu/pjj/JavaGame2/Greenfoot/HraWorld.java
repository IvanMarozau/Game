package cz.mendelu.pjj.JavaGame2.Greenfoot;

import cz.mendelu.pjj.JavaGame2.*;
import greenfoot.Greenfoot;
import greenfoot.World;
/**
 * Rato třída inicalizuje mapu, pozadí a tlačítka: save, load game, kostka.
 * @author xmarozau
 * @version etapa 4
 */

public class HraWorld extends World {
    private final Hra hra;
    private  Player player;
    private Player player1;
    private PlayerActor playerActor;
    private PlayerActor playerActor1;
    private MoveButton moveButton;
    private LokaceActor lokaceActor;
    public HraWorld(){
        this(Hra.starthra());
    }

    public HraWorld(final Hra hra) {
        super(600, 600, 1);
        this.hra = hra;
         player = new Player(0,0);
         player1=new Player(5,5);
         playerActor=new PlayerActor(player,"red");
        playerActor1=new PlayerActor(player1,"black");
        moveButton=new MoveButton(hra);
        new Server(this).start();




        setBackground("fon.jpeg");

        for (int i=0;i<6;i++) {
            for(int j=0;j<6;j++){
                Lokace lokace=Mapa.getLokace(i,j);
            var pa = new LokaceActor(lokace);
            int x = 120 + (lokace.getLokX() * 70);
            int y = 120 + (lokace.getLokY()*70);
            addObject(pa, x, y);
        }
    }
        addObject(new SaveButton(hra),50,550);
        addObject(new KubicActor(),530,40);
        addObject(new LoadButton(hra),500,550);
        addObject(moveButton,300,550 );
        addObject(playerActor,120+(player.getAktualX()*70),120+(player.getAktualY()*70));
        addObject(playerActor1,120+(player1.getAktualX()*70),120+(player1.getAktualY()*70));
    }
   //public void act() {


   //    if (Greenfoot.mouseClicked(lokaceActor)) {
   //                removeObject(playerActor);
   //                addObject(playerActor, 120 + (lokaceActor.getLokace().getLokX() * 70), 120 + (lokaceActor.getLokace().getLokY() * 70));

   //    }
   //}
   public void makeMove(int x, int y) {
       removeObject(playerActor);
       addObject(playerActor, 120 + (x * 70), 120 + (y * 70));
   }

    public Hra getHra() {
        return hra;
    }
}



