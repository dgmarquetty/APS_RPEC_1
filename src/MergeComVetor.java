// QUESTÃO 03 - MERGE COM VETORES
// Classe que implementa a fusão de duas filas ordenadas usando vetores

public class MergeComVetor {

    private int[] filaA = new int[100];
    private int[] filaB = new int[100];
    private int tamanhoA = 0;
    private int tamanhoB = 0;

    public void inserirFilaA(int valor) {
        if (tamanhoA < filaA.length) {
            int i = tamanhoA - 1;
            while (i >= 0 && filaA[i] > valor) {
                filaA[i + 1] = filaA[i];
                i--;
            }
            filaA[i + 1] = valor;
            tamanhoA++;
            System.out.println("Elemento " + valor + " inserido na Fila A.");
        } else {
            System.out.println("Fila A cheia!");
        }
    }

    public void inserirFilaB(int valor) {
        if (tamanhoB < filaB.length) {
            int i = tamanhoB - 1;
            while (i >= 0 && filaB[i] > valor) {
                filaB[i + 1] = filaB[i];
                i--;
            }
            filaB[i + 1] = valor;
            tamanhoB++;
            System.out.println("Elemento " + valor + " inserido na Fila B.");
        } else {
            System.out.println("Fila B cheia!");
        }
    }

    public void removerFilaA() {
        if (tamanhoA == 0) {
            System.out.println("Fila A vazia!");
        } else {
            int removido = filaA[0];
            for (int i = 0; i < tamanhoA - 1; i++) {
                filaA[i] = filaA[i + 1];
            }
            tamanhoA--;
            System.out.println("Removido da Fila A: " + removido);
        }
    }

    public void removerFilaB() {
        if (tamanhoB == 0) {
            System.out.println("Fila B vazia!");
        } else {
            int removido = filaB[0];
            for (int i = 0; i < tamanhoB - 1; i++) {
                filaB[i] = filaB[i + 1];
            }
            tamanhoB--;
            System.out.println("Removido da Fila B: " + removido);
        }
    }

    public void imprimirFilaA() {
        if (tamanhoA == 0) {
            System.out.println("Fila A vazia!");
        } else {
            System.out.print("Fila A: ");
            for (int i = 0; i < tamanhoA; i++) {
                System.out.print(filaA[i] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirFilaB() {
        if (tamanhoB == 0) {
            System.out.println("Fila B vazia!");
        } else {
            System.out.print("Fila B: ");
            for (int i = 0; i < tamanhoB; i++) {
                System.out.print(filaB[i] + " ");
            }
            System.out.println();
        }
    }

    public void mergeFilas() {
        int[] filaC = new int[tamanhoA + tamanhoB];
        int i = 0, j = 0, k = 0;

        while (i < tamanhoA && j < tamanhoB) {
            if (filaA[i] < filaB[j]) {
                filaC[k++] = filaA[i++];
            } else {
                filaC[k++] = filaB[j++];
            }
        }

        while (i < tamanhoA) {
            filaC[k++] = filaA[i++];
        }

        while (j < tamanhoB) {
            filaC[k++] = filaB[j++];
        }

        System.out.print("Fila C (Resultado do Merge): ");
        for (int x = 0; x < k; x++) {
            System.out.print(filaC[x] + " ");
        }
        System.out.println();
    }
}
