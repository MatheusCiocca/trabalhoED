package questao2;

public class SelectionSortMaior {

    // Método de ordenação Selection Sort que seleciona o maior valor
    public static void selectionSortMaior(int[] array) {
        int n = array.length;
        int numeroTrocas = 1;
        for (int i = n - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Troca o maior elemento encontrado com o elemento na posição i
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
            
            // Exibe o estado do vetor após a troca
            System.out.println("Estado do vetor após a " + numeroTrocas + "ª troca : " + java.util.Arrays.toString(array));

            numeroTrocas++;
        }
    }
}