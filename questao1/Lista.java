package questao1;

class Lista {
    private int[] lista;
    private int size;

    public Lista() {
        lista = new int[10];  // tamanho inicial
        size = 0;
    }

    // Adiciona um valor ao final da lista
    public void add(int value) {
        if (size == lista.length) {
            resize();
        }
        lista[size] = value;
        size++;
    }

    // Redimensiona a lista para o dobro do tamanho atual
    private void resize() {
        int[] novaLista = new int[lista.length * 2];
        for (int i = 0; i < lista.length; i++) {
            novaLista[i] = lista[i];
        }
        lista = novaLista;
    }

    // Retorna o tamanho da lista
    public int getSize() {
        return size;
    }

    // Retorna o valor na posição index
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return lista[index];
    }

    // Converte a lista em um vetor
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = lista[i];
        }
        return result;
    }
}