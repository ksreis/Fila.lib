package fila.lib;

public class FilaStrings {

    private No inicio;
    private No fim;

    public boolean vazia() {
        return inicio == null;
    }

    public void enfileirar(String valor) {
        No novoNo = new No(valor);

        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public String desenfileirar() {
        if (!vazia()) {
            String valor = inicio.valor;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            return valor;
        }
        return null;
    }

    private class No {
        String valor;
        No proximo;

        No(String valor) {
            this.valor = valor;
        }
    }
}
