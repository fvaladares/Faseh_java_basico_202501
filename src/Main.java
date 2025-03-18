import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Objeto para ler dados do teclado
        Exercicio1 exercicio1 = new Exercicio1(entrada); // Cria o ponto de execução para o Exercício 1 (Isso é um objeto)

        exercicio1.executar(); // Executa o exercício 1 (aqui, chamamos um método do objeto exercicio1)

        Lista1Exercicio1 lista1Exercicio1 = new Lista1Exercicio1(entrada);
        lista1Exercicio1.executar();
    } // Fim - main
} // Fim
