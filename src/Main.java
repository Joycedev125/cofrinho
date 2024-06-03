import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valor;
        int id = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar valor em real");
            System.out.println("2. Adicionar valor em dolar");
            System.out.println("3. Adicionar valor em euro");
            System.out.println("4. Listar moedas");
            System.out.println("5. Remover moedas de real");
            System.out.println("6. Remover moedas de dolar");
            System.out.println("7. Remover moedas de euro");
            System.out.println("8. Calcular quanto dinheiro existe no cofrinho convertido para Real");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor em real para adicionar: ");
                    valor = scanner.nextDouble();
                    cofrinho.adicionar(new Real(valor,id++));
                    break;
                case 2:
                    System.out.print("Digite o valor em dolar para adicionar: ");
                    valor = scanner.nextDouble();
                    cofrinho.adicionar(new Dolar(valor,id++));
                    break;
                case 3:
                    System.out.print("Digite o valor em euro para adicionar: ");
                    valor = scanner.nextDouble();
                    cofrinho.adicionar(new Euro(valor,id++));
                    break;
                case 4:
                    cofrinho.listagemMoedas();
                    break;
                case 5:
                    System.out.print("Digite o valor em real para remover: ");
                    valor = scanner.nextDouble();
                    cofrinho.remover(valor, "Real"); // isso assume que moedas de igual valor são consideradas iguais
                    break;
                case 6:
                    System.out.print("Digite o valor em dolar para remover: ");
                    valor = scanner.nextDouble();
                    cofrinho.remover(valor, "Dolar"); // isso assume que moedas de igual valor são consideradas iguais
                    break;
                case 7:
                    System.out.print("Digite o valor em euro para remover: ");
                    valor = scanner.nextDouble();
                    cofrinho.remover(valor, "Euro"); // isso assume que moedas de igual valor são consideradas iguais
                    break;
                case 8:
                    System.out.println("Total convertido para Real: " + cofrinho.totalConvertido());
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);

        scanner.close();
    }
}
