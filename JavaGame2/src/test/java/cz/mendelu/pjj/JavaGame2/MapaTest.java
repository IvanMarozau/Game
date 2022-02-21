package cz.mendelu.pjj.JavaGame2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapaTest {
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void getLokace() {
        //setup
        var mapa = new Mapa();
        //when
        var lokace = mapa.getLokace(1, 2);
        //then
        assertNotNull(lokace);
        assertEquals(1, lokace.getLokX());
        assertEquals(2, lokace.getLokY());
    }


    @Test
    void existsLokace() {
        //setup
        Mapa mapa=new Mapa();
        //when
        var exists = Mapa.existsLokace(2,2);
        //then
        assertTrue(exists);
    }


}