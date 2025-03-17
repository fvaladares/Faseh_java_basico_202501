import java.util.Scanner;

public class Exercicio1 {

    Scanner entrada;

    public Exercicio1(Scanner entrada) {
        this.entrada = entrada;
    }

    public void executar() {
        // Declaração de variáveis
        int parcela1;
        int parcela2;
        int resposta;

        System.out.println("Programa para calcular a soma de dois valores inteiros.");

        System.out.print("Informe o primeiro valor:");
        parcela1 = entrada.nextInt();

        System.out.println(); // Imprime uma linha em branco.
        System.out.print("Informe o segundo valor: ");
        parcela2 = entrada.nextInt();

        resposta = parcela1 + parcela2; // Realiza a soma e salva o resultado em resposta;

        System.out.println();

        System.out.println( parcela1 + " + " + parcela2 + " = " + resposta);
        //O que paarecerá na tela:  10 + 5 = 15

// 	   // idade = 42; // idade <- 42;

// 	   System.out.print("Informe a idade: ");
// 	   idade = entrada.nextInt();

// 		System.out.println("Hello World!"); // imprima("Hello World!")
// 		System.out.println("Fabrício Valadares, idade " + idade + " anos."); // imprima("Fabricio Valadares, idade " + idade + " anos.")
    }
}