package questao11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "C:/Users/pernam123/Desktop/trabalho2estrutura/trabalhoED/questao11/arqnumeros.txt";
        int alvo = 1;  

        try {
            Busca arquivoOrdenado = new Busca(caminhoArquivo);
            int indice = arquivoOrdenado.buscaBinaria(alvo);
            
            if (indice != -1) {
                System.out.println("Número encontrado na posição: " + indice);
            } else {
                System.out.println("Número não encontrado no arquivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

