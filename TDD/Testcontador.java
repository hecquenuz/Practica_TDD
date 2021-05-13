import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testcontador {

    @Test
    public void testVerValorDelContadorPorDefecto() {
        Contador c = new Contador();
        assertEquals(0, c.getValor());

    }

    @Test
    public void testVerValorDelContadorConValorInicial5() {
        Contador c = new Contador(5);
        assertEquals(5, c.getValor());
    }

    @Test
    public void testIncrementarContadorPorDefecto() {
        Contador c = new Contador();
        c.incrementa();

        assertEquals(1, c.getValor());
    }

    @Test
    public void testIncrementarContadorDe5A10() {

        Contador c = new Contador(5, 5);
        c.incrementa();

        assertEquals(10, c.getValor());
    }

    @Test
    public void testIncrementarContadorconlimite() {
        Contador c = new Contador(8, 8, 15);

        assertEquals(true, c.incrementa());
    }
}