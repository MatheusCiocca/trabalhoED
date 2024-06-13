package questao3;

public class LDE {

    private Noh primeiro;
    private Noh ultimo;

    public LDE() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void insereInicio(int numero) {
        Noh novo = new Noh(numero);
        if (this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
        }
    }

    public void insereFinal(int numero) {
        Noh novo = new Noh(numero);

        if (this.ultimo == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
    }

    public boolean remove(int numero) {
        Noh aux = this.primeiro;

        while (aux != null && aux.getValor() != numero) {
            aux = aux.getProximo();
        }
        if (aux == null) {
            return false;
        }
        if (aux == primeiro) {
            primeiro = aux.getProximo();
            if (primeiro != null) {
                primeiro.setAnterior(null);
            } else {
                ultimo = null;
            }
        } else if (aux.getProximo() == null) {
            aux.getAnterior().setProximo(null);
            ultimo = aux.getAnterior();
        } else {
            aux.getAnterior().setProximo(aux.getProximo());
            aux.getProximo().setAnterior(aux.getAnterior());
        }
        return true;
    }

    public void imprime() {
        Noh aux = this.primeiro;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getProximo();
        }
    }

    public void imprimeInverso() {
        Noh aux = this.ultimo;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getAnterior();
        }
    }

    public int nroPares() {
        int count = 0;
        Noh aux = this.primeiro;
        while (aux != null) {
            if (aux.getValor() % 2 == 0) {
                count++;
            }
            aux = aux.getProximo();
        }
        return count;

    }
}