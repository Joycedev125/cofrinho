public abstract class Moeda {
    protected double valor;
    protected String type;
    protected int id;
    public Moeda(double valor, int id, String type) {
        this.valor = valor;
        this.id = id;
        this.type = type;
    }

    public abstract void info();

    public abstract double converter();
}
