package questao11;

public class BuscaBinaria {

    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                return array[meio]; // Valor encontrado
            }

            if (array[meio] < valor) {
                inicio = meio + 1; // Busca na metade direita
            } else {
                fim = meio - 1; // Busca na metade esquerda
            }
        }

        return -1; // Valor não encontrado
    }

}