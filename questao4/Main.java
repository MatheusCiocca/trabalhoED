package questao4;

public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        lista.insereInicio(2);
        lista.insereFinal(5);
        lista.insereFinal(7);
        lista.insereFinal(10);

        System.out.println("Lista inicial:");
        lista.imprime();

        System.out.println("Inserindo o número 6:");
        lista.add_ordenado(6);
        lista.imprime();

        System.out.println("Inserindo o número 1:");
        lista.add_ordenado(1);
        lista.imprime();

        System.out.println("Inserindo o número 8:");
        lista.add_ordenado(8);
        lista.imprime();
    }
}
