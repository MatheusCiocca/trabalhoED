package questao1;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 2, 3, 4, 5};
        int[] vetor2 = {2, 2, 3, 5, 6};

        int[] interseccao = InterseccaoVetores.interseccao(vetor1, vetor2);

        // Exibir o vetor de interseção
        System.out.println("Interseção: " + java.util.Arrays.toString(interseccao));
    }
}