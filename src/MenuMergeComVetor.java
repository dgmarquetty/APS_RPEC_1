// QUESTÃO 03 - MERGE COM VETORES
// Menu principal para testar o merge de filas ordenadas usando vetores

import java.util.Scanner;

public class MenuMergeComVetor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        MergeComVetor merge = new MergeComVetor();

        int opcao;

        do {
            System.out.println("\n--- MENU MERGE COM VETORES ---");
            System.out.println("1 - Inserir elemento na Fila A (ordenada)");
            System.out.println("2 - Inserir elemento na Fila B (ordenada)");
            System.out.println("3 - Remover da Fila A");
            System.out.println("4 - Remover da Fila B");
            System.out.println("5 - Imprimir Fila A");
            System.out.println("6 - Imprimir Fila B");
            System.out.println("7 - Merge das filas A + B em C (ordenada)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    int valorA = leitor.nextInt();
                    merge.inserirFilaA(valorA);
                    break;

                case 2:
                    System.out.print("Digite o valor: ");
                    int valorB = leitor.nextInt();
                    merge.inserirFilaB(valorB);
                    break;

                case 3:
                    merge.removerFilaA();
                    break;

                case 4:
                    merge.removerFilaB();
                    break;

                case 5:
                    merge.imprimirFilaA();
                    break;

                case 6:
                    merge.imprimirFilaB();
                    break;

                case 7:
                    merge.mergeFilas();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        leitor.close();
    }
}
