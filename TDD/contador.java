public class Contador {

    // Propiedades
    private int valor;
    private int incremento;

    // Contructores
    public Contador(int i) {
        this.valor = i;
        this.incremento = 1;
    }

    public Contador() {
        this(0);
    }

    public Contador(int i, int j) {
        this(i);

        this.incremento = j;
    }

    // Metodos
    public int getValor() {

        return this.valor;
    }

    public void incrementa() {

        this.valor = this.valor + this.incremento;

    }

}
