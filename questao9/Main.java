package questao9;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {7,1,1,3,2};

        System.out.println("Vetor Original:");
        Vetor.imprimeVetor(vetor1, 0);

        System.out.println();

        Vetor.bubbleSort(vetor1);

    
    }
}
