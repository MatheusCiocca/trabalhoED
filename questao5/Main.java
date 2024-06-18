package questao5;

public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        lista.insereInicio(3);
        lista.insereInicio(2);
        lista.insereInicio(1);
        lista.insereFinal(4);
        lista.insereFinal(5);

        System.out.println("Impressão iterativa:");
        lista.imprime();

        System.out.println("--------------------------------------");

        System.out.println("Impressão recursiva:");
        lista.imprime_rec();
    }    
}
