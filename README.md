# APS_RPEC_1 
# Atividade Prática Supervisionada

> Disciplina: Resolução de Problemas Estruturados em Computação  
> Universidade: PUCPR 
> 
> Prof: Andrey Cabral Meira
> Aluno: dgmarquetty  
> Tema: Estruturas de Dados — Pilha, Fila, Merge com Listas e Vetores

---

## Descrição

Este projeto implementa três estruturas e funcionalidades:

### Questão 01 — Pilha
- Estrutura de pilha com lista encadeada.
- Operações: Inserir, Remover, Imprimir.
- Arquivos principais:
    - `Pilha.java`
    - `MenuPilha.java`

### Questão 02 — Fila
- Estrutura de fila com lista encadeada.
- Operações: Inserir, Remover, Imprimir.
- Arquivos principais:
    - `Fila.java`
    - `MenuFila.java`

### Questão 03 — Merge de Filas Ordenadas
- Duas versões:
    - `MergeComLista.java` → Usa lista encadeada
    - `MergeComVetor.java` → Usa vetores
- Permite inserir/remover elementos nas filas A e B.
- Mostra passo a passo e resultado final (fila C ordenada).
- Menus:
    - `MenuMerge.java`
    - `MenuMergeComVetor.java`

---

## Exemplos de Execução

```txt
Fila A: 1 4 6 10
Fila B: 2 3 8 9
Resultado do Merge (Fila C): 1 2 3 4 6 8 9 10
