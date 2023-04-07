package fila.lib;

public class FilaObject {
	private No inicio, fim;

    public FilaObject() {
        inicio = null;
        fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void enfileirar(Object valor) {
        No novoNo = new No(valor);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return null;
        } else {
            Object valor = inicio.getValor();
            inicio = inicio.getProximo();

            if (inicio == null) {
                fim = null;
            }

            return valor;
        }
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
        } else {
            No atual = inicio;

            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }

    private class No {
        private Object valor;
        private No proximo;

        public No(Object valor) {
            this.valor = valor;
            proximo = null;
        }

        public Object getValor() {
            return valor;
        }

        public void setValor(Object valor) {
            this.valor = valor;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }
}

