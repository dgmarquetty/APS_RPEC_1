
// QUESTÃO 03 - MERGE COM LISTA ENCADEADA
// Classe que realiza a fusão (merge) de duas filas ordenadas em uma terceira, utilizando listas encadeadas


public class MergeComLista {
    // Método que faz o merge entre duas filas ordenadas em uma terceira fila ordenada
    public static Fila mergeFilas(Fila filaA, Fila filaB) {
        Fila filaC = new Fila(); // Fila que receberá a junção
        No atualA = filaA.getInicio();  // Posição inicial da filaA
        No atualB = filaB.getInicio();  // Posição inicial da filaB

        // Enquanto houver elementos em ambas as filas
        while (atualA != null && atualB != null) {
            if (atualA.dado <= atualB.dado) {
                filaC.inserir(atualA.dado); // Insere o menor na filaC
                atualA = atualA.proximo;   // Avança na filaA
            } else {
                filaC.inserir(atualB.dado); // Insere o menor da filaB
                atualB = atualB.proximo;   // Avança na filaB
            }
        }

        // Copia os elementos restantes da filaA, se houver
        while (atualA != null) {
            filaC.inserir(atualA.dado);
            atualA = atualA.proximo;
        }

        // Copia os elementos restantes da filaB, se houver
        while (atualB != null) {
            filaC.inserir(atualB.dado);
            atualB = atualB.proximo;
        }

        return filaC;
    }
}
