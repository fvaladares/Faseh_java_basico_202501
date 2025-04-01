import java.util.Scanner;

public class Exercicio9 {
    Scanner entrada;

    public Exercicio9(Scanner entrada) {
        // Inicializando o objeto que faz a leitura dos dados.

        this.entrada = entrada;
    }

    public void executar() {
        int quantidadeCanetas; // N
        int valorTotalPago; // Z
        double troco; // Y
        double valorUnitario; // x

        System.out.print("Informe a quantidade de canetas: ");
        quantidadeCanetas = entrada.nextInt();

        System.out.println(); // Inserir linha em branco

        System.out.print("Informe o valor total pago: ");
        valorTotalPago = entrada.nextInt();

        System.out.println();

        System.out.print("Informe o valor do troco: ");
        troco = entrada.nextDouble();

        System.out.println("Calculando o resultado...");

        valorUnitario = (valorTotalPago - troco) / quantidadeCanetas;

        System.out.println();
        System.out.println("O valor de cada caneta é: R$ " + valorUnitario);
    }
}
