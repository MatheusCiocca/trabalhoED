package questao4;

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
        return primeiro;
    }

    public Noh getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
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

    public boolean remove(int valor) {
        Noh aux = this.primeiro;

        while (aux != null && aux.getValor() != valor) {
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
        this.tamanho--;
        return true;
    }

    public void imprime() {
        Noh aux = this.primeiro;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProximo();
        }
        System.out.println();
    }

    public void imprimeInverso() {
        Noh aux = this.ultimo;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getAnterior();
        }
        System.out.println();
    }

    // Método para inserir um valor de forma ordenada na lista
    public void add_ordenado(int valor) {
        Noh novo = new Noh(valor);

        if (this.primeiro == null) {
            // Inserir como o primeiro e único elemento
            this.primeiro = novo;
            this.ultimo = novo;
        } else if (valor <= this.primeiro.getValor()) {
            // Inserir no início
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
        } else if (valor >= this.ultimo.getValor()) {
            // Inserir no final
            novo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        } else {
            // Inserir no meio
            Noh aux = this.primeiro;
            while (aux.getProximo() != null && aux.getProximo().getValor() < valor) {
                aux = aux.getProximo();
            }
            novo.setProximo(aux.getProximo());
            novo.setAnterior(aux);
            aux.getProximo().setAnterior(novo);
            aux.setProximo(novo);
        }
        this.tamanho++;
    }
}
