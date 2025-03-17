import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int idade; // inteiro: idade;
        Scanner entrada = new Scanner(System.in); // Objeto para ler dados do teclado
        Exercicio1 exercicio1 = new Exercicio1(entrada);

        exercicio1.executar();
    } // Fim - main
} // Fim
