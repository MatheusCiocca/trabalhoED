package questao6;

public class Main {
    public static void main(String[] args) {
        LDE lista1 = new LDE();
        lista1.insereFinal(1);
        lista1.insereFinal(2);
        lista1.insereFinal(3);
        lista1.insereFinal(4);

        LDE lista2 = new LDE();
        lista2.insereFinal(5);
        lista2.insereFinal(6);
        lista2.insereFinal(7);
        lista2.insereFinal(8);

        System.out.println("Lista 1:");
        lista1.imprime();

        System.out.println("Lista 2:");
        lista2.imprime();

        LDE novaLista = LDE.concat(lista1, lista2);

        System.out.println("Lista 1 após concatenação com Lista 2:");
        novaLista.imprime();
    }
}
