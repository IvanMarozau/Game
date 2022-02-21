package cz.mendelu.pjj.JavaGame2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HraTest {
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void hra() {
        //setup + when
       var hra=Hra.starthra();
       //then
       assertNotNull(hra);
       assertTrue(Mapa.existsLokace(1,2));
       assertFalse(Mapa.existsLokace(7,8));

    }
    /**
     * @autor xmarozau
     * @version etapa 2
     */
    @Test
    void createHra_duplicity() {
        //setup + when
        var hra_1=Hra.starthra();
        var hra_2=  Hra.starthra();
        //then
        assertNotSame(hra_1, hra_2);
    }

}