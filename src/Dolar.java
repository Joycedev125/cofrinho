public class Dolar extends Moeda {
    public Dolar(double valor,int id) {
        super(valor,id, "Dolar");
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dolar - Valor: " + valor);
    }

    @Override
    public double converter() {
        double taxaConversao = 4.81;
        return valor * taxaConversao;
    }
}

