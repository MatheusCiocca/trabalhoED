package questao7;

public class LSE {
    
    private Noh primeiro;

    public LSE() {
        this.primeiro = null;
    }

    public void insereInicio(int valor) {
        Noh novo = new Noh(valor);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }

    public void insereFinal(int valor) {
        Noh novo = new Noh(valor);
        if (this.primeiro == null) {
            this.primeiro = novo;
        } else {
            Noh aux = this.primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public void imprime() {
        Noh aux = this.primeiro;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProximo();
        }
        System.out.println();
    }

    // Método para ordenar a lista usando Bubble Sort
    public void bubbleSort() {
        if (primeiro == null) {
            return;
        }

        boolean trocou;
        do {
            trocou = false;
            Noh atual = primeiro;

            while (atual.getProximo() != null) {
                Noh proximo = atual.getProximo();
                if (atual.getValor() > proximo.getValor()) {
                    // Troca os valores
                    int temp = atual.getValor();
                    atual.setValor(proximo.getValor());
                    proximo.setValor(temp);
                    trocou = true;
                }
                atual = atual.getProximo();
            }
        } while (trocou);
    }
}
