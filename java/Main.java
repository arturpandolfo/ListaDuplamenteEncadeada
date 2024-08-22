public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(30);

        System.out.println("Lista depois insercao no inicio:");
        lista.exibir(); 

        lista.inserirNoFinal(40);
        lista.inserirNoFinal(50);

        System.out.println("Lista depois da insercao no final:");
        lista.exibir();

        lista.remover(20);
        System.out.println("Lista depois remover o valor 20:");
        lista.exibir();

        System.out.println("Lista exibida em ordem reversa:");
        lista.exibirReverso();
    }
}
