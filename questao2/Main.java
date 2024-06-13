package questao2;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        int[] vetor = { 2, 64, 25, 12, 38, 11, 128 };

        System.out.println("Vetor original: " + java.util.Arrays.toString(vetor) + "\n");

        SelectionSortMaior.selectionSortMaior(vetor);

        System.out.println("\nVetor ordenado: " + java.util.Arrays.toString(vetor));
    }
}