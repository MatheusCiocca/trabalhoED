package questao8;

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

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        int passo = 0;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMinimo];
                vetor[indiceMinimo] = temp;
                imprimeVetor(vetor, ++passo);
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        int passo = 0;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
                imprimeVetor(vetor, ++passo);
            }
            vetor[j + 1] = chave;
            if (j + 1 != i) { // Para mostrar o estado do vetor após a inserção da chave
                imprimeVetor(vetor, ++passo);
            }
        }
    }

    public static void imprimeVetor(int[] vetor, int passo) {
        System.out.println("Passo " + passo + ":");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}