import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testcontador {

    @Test
    public void testVerValorDelContadorPorDefecto() {
        Contador cc = new Contador();
        assertEquals(0, cc.getValor());

    }
}