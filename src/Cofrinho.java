import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        this.moedas.add(moeda);
    }

    public void remover(double valor, String type) {
        Iterator<Moeda> it = moedas.iterator();
        while (it.hasNext()) {
            Moeda moeda = it.next();
            if (moeda.valor == valor && Objects.equals(moeda.type, type)) {
                it.remove();
                break;
            }
        }
    }

    public void listagemMoedas() {
        for(Moeda moeda : this.moedas) {
            moeda.info();
        }
    }

    public double totalConvertido() {
        double total = 0;
        for(Moeda moeda : this.moedas) {
            total += moeda.converter();
        }
        return total;
    }
}
