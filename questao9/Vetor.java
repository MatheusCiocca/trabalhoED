package questao9;

public class Vetor {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        int passo = 0;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                    imprimeVetor(vetor, ++passo);
                }
            }
            n--;
        } while (trocou);
    }

    public static void imprimeVetor(int[] vetor, int passo) {
        System.out.println("Passo " + passo + ":");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = {7, 1, 1, 3, 2};
        
        // Imprime o vetor original
        System.out.print("Vetor original: ");
        imprimeVetor(vetor, 0);
        
        // Chama o método bubbleSort para ordenar o vetor
        bubbleSort(vetor);
        
        // Imprime o vetor ordenado
        System.out.print("Vetor ordenado: ");
        imprimeVetor(vetor, 0);
    }
}
