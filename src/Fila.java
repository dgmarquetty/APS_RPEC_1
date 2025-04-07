
// QUESTÃO 02 - FILA

public class Fila {

    private No inicio; // Nó que representa o início da fila
    private No fim;    // Nó que representa o fim da fila

    // Construtor: inicializa a fila como vazia
    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para inserir um novo elemento no final da fila
    public void inserir(int valor) {
        No novoNo = new No(valor); // Cria um novo nó com o valor informado, instanciando um objeto da classe

        if (estaVazia()) {
            // Se a fila estiver vazia, o início e fim apontam para o mesmo nó
            inicio = novoNo;
        } else {
            // Se não estiver vazia, o último nó aponta para o novo nó
            fim.proximo = novoNo;
        }

        // Atualiza o ponteiro do fim para o novo nó
        fim = novoNo;

        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    // Método para remover o elemento do início da fila
    public void remover() {
        if (estaVazia()) {
            System.out.println("Fila vazia! Nada para remover.");
        } else {
            System.out.println("Removido: " + inicio.dado);
            inicio = inicio.proximo; // Avança o ponteiro de início

            // Se o início for nulo, significa que a fila ficou vazia
            if (inicio == null) {
                fim = null;
            }
        }
    }

    // Método para imprimir todos os elementos da fila
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.print("Fila: ");
            No atual = inicio;

            // Percorre do início até o final da fila
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }

            System.out.println(); // Quebra linha final da impressão
        }
    }

    // Método auxiliar que verifica se a fila está vazia
    private boolean estaVazia() {
        return inicio == null;
    }

    // Método adc solicitado pelo prof.:
    // Permite acessar o nó inicial da fila (usado na operação de merge)
    public No getInicio() {
        return inicio;
    }
}
