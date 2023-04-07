package fila.lib;

public class FilaInt {

    private No inicio;
    private No fim;

    public boolean vazia() {
        return inicio == null;
    }

    public void enfileirar(int valor) {
        No novoNo = new No(valor);

        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public int desenfileirar() {
        if (!vazia()) {
            int valor = inicio.valor;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            return valor;
        }
        return -1; // retorna -1 se a fila estiver vazia
    }

    private class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }
}


