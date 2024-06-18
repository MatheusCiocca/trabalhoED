package questao4;

public class Noh {

    private int valor;
    private Noh proximo;
    private Noh anterior;

    public Noh(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public Noh getAnterior() {
        return anterior;
    }

    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }

}
