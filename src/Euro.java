public class Euro extends Moeda {
    public Euro(double valor,int id) {
        super(valor,id, "Euro");
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro - Valor: " + valor);
    }

    @Override
    public double converter() {
        double taxaConversao = 5.40;
        return valor * taxaConversao;
    }
}
