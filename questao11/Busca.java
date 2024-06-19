package questao11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Busca {
    private List<Integer> numeros;

    public Busca(String caminhoArquivo) throws IOException {
        this.numeros = lerNumerosDoArquivo(caminhoArquivo);
    }

    private List<Integer> lerNumerosDoArquivo(String caminhoArquivo) throws IOException {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                numeros.add(Integer.parseInt(linha.trim()));
            }
        }
        return numeros;
    }

    public int buscaBinaria(int alvo) {
        int esquerda = 0;
        int direita = numeros.size() - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (numeros.get(meio) == alvo) {
                return meio;
            } else if (numeros.get(meio) < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; 
    }
}


