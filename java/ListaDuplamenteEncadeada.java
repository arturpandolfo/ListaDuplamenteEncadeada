public class ListaDuplamenteEncadeada {
    private No cabeca;
    private No cauda;

    public ListaDuplamenteEncadeada() {
        cabeca = null;
        cauda = null;
    }

    public void inserirNoInicio(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) { 
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    public void inserirNoFinal(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    public void remover(int dado) {
        if (cabeca == null) {
            System.out.println("A lista esta vazia.");
            return;
        }

        No atual = cabeca;

        while (atual != null && atual.dado != dado) {
            atual = atual.proximo;
        }

        if (atual == null) {  
            System.out.println("No com valor " + dado + " nao encontrado.");
            return;
        }

        if (atual == cabeca) {  
            cabeca = atual.proximo;
            if (cabeca != null) {
                cabeca.anterior = null;
            }
        } else if (atual == cauda) {  
            cauda = atual.anterior;
            if (cauda != null) {
                cauda.proximo = null;
            }
        } else {  
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }

        System.out.println("No com valor " + dado + " removido.");
    }


    public void exibir() {
        if (cabeca == null) {
            System.out.println("A lista esta vazia.");
            return;
        }

        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }


    public void exibirReverso() {
        if (cauda == null) {
            System.out.println("A lista esta vazia.");
            return;
        }

        No atual = cauda;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}
