package questao8;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor Original:");
        Vetor.imprimeVetor(vetor1, 0);

        System.out.println();

        System.out.println("Bubble Sort:");
        Vetor.bubbleSort(vetor1);
        
        System.out.println("-----------------------------");

        int[] vetor2 = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor Original:");
        Vetor.imprimeVetor(vetor2, 0);

        System.out.println();

        System.out.println("Selection Sort:");
        Vetor.selectionSort(vetor2);

        System.out.println("-----------------------------");

        int[] vetor3 = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor Original:");
        Vetor.imprimeVetor(vetor3, 0);

        System.out.println();

        System.out.println("Insertion Sort:");
        Vetor.insertionSort(vetor3);

    }
    
}
