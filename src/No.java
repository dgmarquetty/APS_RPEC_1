
// QUESTÃO 01 - Nó

public class No {

    // Atributo que armazena o valor que o nó ta guardando
    int dado;

    // Referência/ponteiro para o próx nó da lista (quem vem abaixo na pilha)
    No proximo;

    // Construtor da classe Nó
    public No(int dado) {
        this.dado = dado;       // Armazena o valor passado
        this.proximo = null;    // Por padrão, não aponta para nenhum outro nó
    }
}

