
// QUESTÃO 01 - Pilha

public class Pilha {

    // Aponta pro nó que ta no topo da pilha
    private No topo;

    // Construtor da pilha: inicialmente está vazia (topo é nulo)
    public Pilha() {
        this.topo = null;
    }

    // Método para inserir um novo valor no topo da pilha
    public void inserir(int valor) { // Novo valor é colocado no topo da pilha
        // Cria um novo nó com o valor fornecido
        No novoNo = new No(valor);

        // O novo nó passa a apontar para o antigo topo
        novoNo.proximo = topo;

        // O novo nó agora é o topo da pilha
        topo = novoNo;

        System.out.println(" Elemento " + valor + " inserido no topo da pilha.");
    }

    // Método para remover o elemento do topo da pilha
    public void remover() {
        if (topo == null) {
            // Se o topo for nulo, a pilha está vazia
            System.out.println(" A pilha está vazia. Nada a remover.");
        } else {
            // Salva o valor que será removido
            int valorRemovido = topo.dado;

            // Move o topo para o próximo nó da pilha
            topo = topo.proximo;

            System.out.println(" Elemento " + valorRemovido + " removido da pilha.");
        }
    }

    // Método para listar todos os elementos da pilha
    public void imprimir() {
        if (topo == null) {
            System.out.println(" A pilha está vazia.");
        } else {
            System.out.println(" Elementos da pilha (do topo para a base):");

            // Variável para percorrer a pilha
            No atual = topo;

            // Enquanto não chegar ao final da lista (nulo)
            while (atual != null) {
                System.out.println("  " + atual.dado);
                atual = atual.proximo;  // Avança para o próximo nó
            }
        }
    }
}

