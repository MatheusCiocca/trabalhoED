package questao5;

public class Noh {

    private int valor;
    private Noh proximo;

    public Noh(int valor) {
        this.valor = valor;
        this.proximo = null;
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

}
