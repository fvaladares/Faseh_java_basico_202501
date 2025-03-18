import java.util.Scanner;

// Aqui inicia a classe (um modelo de algum objeto do mundo real que será usado em nosso programa)
public class Lista1Exercicio1 {
    private final Scanner entrada;

    public Lista1Exercicio1(Scanner entrada) {
        this.entrada = entrada;
    }

    //Aqui vai a implementação do algoritmo. (Chamamos de método (similar a uma função))
    public void executar() { // início
        int numeroX;
        int numeroY;
        int restoDivisao;

        System.out.println("Cálculo do resto da divisão de inteiros!");
        System.out.print("\nDIGITE O VALOR DO PRIMEIRO NÚMERO (X): "); // \n insere uma quebra de linha.
        numeroX = entrada.nextInt();

        System.out.print("\nDIGITE O VALOR DO SEGUNDO NÚMERO (Y): "); //
        numeroY = entrada.nextInt();

        System.out.println();

        restoDivisao = numeroX % numeroY;

        System.out.println("O RESTO DA DIVISÃO ENTRE ELES É: " + restoDivisao);
        System.out.println();
    } // fim

} // Fim da classe.
