package cz.mendelu.pjj.JavaGame2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void hodKostkami() {
        assertTrue(Player.hodKostkami()>0 && Player.hodKostkami()<=6);
        assertFalse(Player.hodKostkami() > 6 || Player.hodKostkami() <= 0);
    }
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void canMove() {
        //setup
        Mapa mapa= new Mapa();
        Player player = new Player(0, 0);
        //when
       var result = player.canMove(player.getAktualX(),player.getAktualY());
       //then
        assertSame(2,  result.size());
    }
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void canMove_neexist() {
        //setup
        Mapa mapa= new Mapa();
        Player player = new Player(-2, -2);
        //when
        var result = player.canMove(player.getAktualX(),player.getAktualY());
        //then
        assertTrue(result.isEmpty());
    }
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void canMove_hasPlayer() {
        //setup
        Mapa mapa= new Mapa();
        Player player = new Player(3, 3);
        Player player2=new Player(2,3);
        //when
        var result = player.canMove(player.getAktualX(),player.getAktualY());
        //then
        assertSame(4,result.size());
    }
}