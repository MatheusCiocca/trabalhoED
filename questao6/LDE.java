package questao6;

public class LDE {
    private Noh primeiro;
    private Noh ultimo;
    private int tamanho;

    public LDE() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public Noh getPrimeiro() {
        return this.primeiro;
    }

    public Noh getUltimo() {
        return this.ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setPrimeiro(Noh primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(Noh ultimo) {
        this.ultimo = ultimo;
    }

    public void insereInicio(int valor) {
        Noh novo = new Noh(valor);
        if (this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
        }
        this.tamanho++;
    }

    public void insereFinal(int valor) {
        Noh novo = new Noh(valor);
        if (this.ultimo == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
        this.tamanho++;
    }

    public void imprime() {
        Noh aux = this.primeiro;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProximo();
        }
        System.out.println();
    }

    // Método para concatenar outra lista duplamente encadeada
    public static LDE concat(LDE lista1, LDE lista2) {
        LDE novaLista = new LDE();

        if (lista1.primeiro != null) {
            Noh aux = lista1.primeiro;
            while (aux != null) {
                novaLista.insereFinal(aux.getValor());
                aux = aux.getProximo();
            }
        }

        if (lista2.primeiro != null) {
            Noh aux = lista2.primeiro;
            while (aux != null) {
                novaLista.insereFinal(aux.getValor());
                aux = aux.getProximo();
            }
        }

        return novaLista;
    }
}
