package questao3;

public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        lista.insereInicio(10);
        lista.insereInicio(15);
        lista.insereInicio(20);
        lista.insereInicio(25);
        lista.insereFinal(30);
        lista.insereFinal(35);

        System.out.println("Quantidade de pares: " + lista.nroPares());
    }
}