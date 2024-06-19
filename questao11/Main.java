package questao11;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 23, 33, 43, 53, 63, 73, 83, 93};
        int valor = 53;

        int resultado = BuscaBinaria.buscaBinaria(array, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado! " + resultado);
        } else {
            System.out.println("Valor não encontrado");
        }
        
    }
}

