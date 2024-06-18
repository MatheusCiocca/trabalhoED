package questao7;

public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        lista.insereFinal(3);
        lista.insereFinal(1);
        lista.insereFinal(4);
        lista.insereFinal(5);
        lista.insereFinal(2);

        System.out.println("Lista original:");
        lista.imprime();

        lista.bubbleSort();

        System.out.println("Lista ordenada:");
        lista.imprime();
    }
}
