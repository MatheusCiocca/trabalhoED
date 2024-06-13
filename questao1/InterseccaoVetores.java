package questao1;

public class InterseccaoVetores {

    // Função para ordenar um vetor utilizando o algoritmo de ordenação por seleção
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static int[] interseccao(int[] vetor1, int[] vetor2) {
        // Ordenar os dois vetores
        selectionSort(vetor1);
        selectionSort(vetor2);

        // Usar nossa lista dinâmica para armazenar os elementos comuns (interseção)
        Lista interseccaoLista = new Lista();
        
        // Usar dois ponteiros para iterar sobre os vetores
        int i = 0, j = 0;
        while (i < vetor1.length && j < vetor2.length) {
            if (vetor1[i] == vetor2[j]) {
                // Adicionar à lista de interseção se forem iguais e mover ambos os ponteiros
                if (interseccaoLista.getSize() == 0 || interseccaoLista.get(interseccaoLista.getSize() - 1) != vetor1[i]) {
                    interseccaoLista.add(vetor1[i]);
                }
                i++;
                j++;
            } else if (vetor1[i] < vetor2[j]) {
                // Mover o ponteiro do vetor1
                i++;
            } else {
                // Mover o ponteiro do vetor2
                j++;
            }
        }

        // Converter a lista de interseção em um vetor
        return interseccaoLista.toArray();
    }
}