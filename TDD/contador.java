public class Contador {

    private int valor;

    public Contador(int i) {
        this.valor = i;
    }

    public Contador() {
        this(0);
    }

    public int getValor() {

        return this.valor;
    }

    public void incrementa() {
        this.valor++;

    }
}
