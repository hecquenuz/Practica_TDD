import org.junit.Test;

public class Testcontador {

    @Test
    public void testVerValorDelContadorPorDefecto() {
        ContadorCircular cc = new ContadorCircular();
        assertEquals(0, cc.getValor());

    }
}