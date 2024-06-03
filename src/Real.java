public class Real extends Moeda {

    public Real(double valor,int id) {
        super(valor,id,"Real");
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real - Valor: " + valor);
    }

    @Override
    public double converter() {
        return valor; // como a conversão é para Real, o valor não muda
    }
}
