public class FilaVetor {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaVetor(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == elementos.length;
    }

    public void inserir(int valor) {
        if (estaCheia()) {
            System.out.println("Fila cheia! Não é possível inserir.");
            return;
        }
        elementos[fim] = valor;
        fim++;
        tamanho++;
        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    public int remover() {
        if (estaVazia()) {
            System.out.println("Fila vazia! Nada para remover.");
            return -1;
        }
        int valorRemovido = elementos[inicio];
        inicio++;
        tamanho--;
        System.out.println("Elemento " + valorRemovido + " removido da fila.");
        return valorRemovido;
    }

    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila: ");
        for (int i = inicio; i < fim; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public int tamanho() {
        return tamanho;
    }

    public int elemento(int posicao) {
        return elementos[inicio + posicao];
    }
}

