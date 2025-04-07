
// QUESTÃO 01 - PILHA
// Classe principal para manipular a estrutura de Pilha

import java.util.Scanner; // aqui eu importo a classe Scanner

public class MenuPilha { // minha classe principal, publica

    public static void main(String[] args) { // aqui eu dou vida ao meu main

        Scanner leitor = new Scanner(System.in);  // Pra ler as opções do usuário
        Pilha pilha = new Pilha();               // Instancia a estrutura Pilha - cria o objeto real da classe pilha

        int opcao;  // Variável que armazena a opção escolhida pelo usuário o input

        do {
            // Exibe o menu de opções
            System.out.println("\n --- MENU DA PILHA ---");
            System.out.println(" 1️- Inserir elemento na pilha");
            System.out.println(" 2️- Remover elemento da pilha");
            System.out.println(" 3️- Imprimir todos os elementos da pilha");
            System.out.println(" 0️- Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção digiada
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valorInserir = leitor.nextInt();
                    pilha.inserir(valorInserir);   // Chama o método de inserção
                    break;

                case 2:
                    pilha.remover();               // Chama o método de remoção
                    break;                         // LIFO – Last In, First Out (Último a entrar, primeiro a sair)
                                                   // nesse case que chama o metodo de remoção, ele removerá
                case 3:                            // o ultimo input da pilha.
                    pilha.imprimir();              // Chama o método de impressão
                    break;

                case 0:
                    System.out.println(" Encerrando o programa...");
                    break;

                default:
                    System.out.println(" Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);  // Continua até o usuário digitar 0

        leitor.close();  // Fecha o scanner
    }
}

