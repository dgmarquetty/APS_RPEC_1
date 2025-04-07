
// QUESTÃO 02 - MENU DA FILA // Classe principal que executa a estrutura de Fila.
// Classe de interface de usuário para manipular a fila encadeada via menu

import java.util.Scanner;  // Importa a classe Scanner para entrada de dados

public class MenuFila {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);  // Scanner para ler entradas do teclado
        Fila fila = new Fila();                   // Cria uma nova fila vazia

        int opcao;  // Armazena a opção escolhida pelo usuário

        // Loop do menu até o usuário escolher sair (0)
        do {
            System.out.println("\n--- MENU DA FILA ---");
            System.out.println("1 - Inserir elemento na fila");
            System.out.println("2 - Remover elemento da fila");
            System.out.println("3 - Imprimir todos os elementos da fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();  // Lê a entrada numérica do usuário

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valor = leitor.nextInt();  // Lê o valor a ser inserido
                    fila.inserir(valor);           // Chama o método inserir()
                    break;

                case 2:
                    fila.remover();                // Remove o elemento do início
                    break;

                case 3:
                    fila.imprimir();               // Imprime todos os elementos
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);  // Condição de parada

        leitor.close();  // fecha o Scanner
    }
}
