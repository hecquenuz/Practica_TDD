public class Contador {

    // Propiedades
    private int inicial;
    private int valor;
    private int incremento;
    private int limite;

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

    public Contador(int valor, int incremento, int limite) {
        this.inicial = valor;
        this.valor = valor;
        this.incremento = incremento;
        this.limite = limite;

    }

    // Metodos
    public int getValor() {

        return this.valor;
    }

    public boolean incrementa() {
        this.valor += this.incremento;

        if (this.valor > this.limite) {
            this.valor = this.inicial;
            return true; // Si se ha superado el limite
        } else {
            return false;
        }

    }

}
