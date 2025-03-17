import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int idade; // inteiro: idade;
        Scanner entrada = new Scanner(System.in); // Objeto para ler dados do teclado
        // Declaração de variáveis
        int parcela1;
        int parcela2;
        int resposta;
        // Fim da declaração de variáveis

//        Exibe uma mensagem na tela com uma quebra de linha no final
        System.out.println("Programa para calcular a soma de dois valores inteiros.");

        System.out.print("Informe o primeiro valor:");
        parcela1 = entrada.nextInt(); // Faz a leitura de um número inteiro

        System.out.println(); // Imprime uma linha em branco.
        System.out.print("Informe o segundo valor: ");
        parcela2 = entrada.nextInt();

        resposta = parcela1 + parcela2; // Realiza a soma e salva o resultado em resposta;

        System.out.println();

        System.out.println(parcela1 + " + " + parcela2 + " = " + resposta);
        //O que paarecerá na tela:  10 + 5 = 15

// 	   // idade = 42; // idade <- 42;

// 	   System.out.print("Informe a idade: ");
// 	   idade = entrada.nextInt();

// 		System.out.println("Hello World!"); // imprima("Hello World!")
// 		System.out.println("Fabrício Valadares, idade " + idade + " anos."); // imprima("Fabricio Valadares, idade " + idade + " anos.")
    } // Fim - main
} // Fim
