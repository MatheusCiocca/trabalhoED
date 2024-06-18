package questao5;

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

    // Método recursivo auxiliar para imprimir a lista
    private void imprime_rec_aux(Noh noh) {
        if (noh != null) {
            System.out.print(noh.getValor() + " ");
            imprime_rec_aux(noh.getProximo());
        }
    }

    // Método público para imprimir a lista de forma recursiva
    public void imprime_rec() {
        imprime_rec_aux(this.primeiro);
        System.out.println();
    }
}