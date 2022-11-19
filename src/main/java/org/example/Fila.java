package org.example;

public class Fila {
    private No primeiro;
    private No ultimo;

    private int tamanho;

//    Por clareza estamos usando a declaração do construtor.
    public Fila() {
        setPrimeiro(null);
        setUltimo(null);
        setTamanho(0);
    }

//   modificadores
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanho(int i) {
        this.tamanho = tamanho;
    }

//    acesso
    public No getPrimeiro() {
        return this.primeiro;
    }

    public No getUltimo() {
        return this.ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public void enfileira(int i) {
        No novo = new No(i);
        if(this.estaVazia()) {
            setPrimeiro(novo);
        } else {
            ultimo.setProximo(novo);
        }
        setUltimo(novo);
        tamanho++;
    }

    public int desenfileira() {
        int temp = primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());
        if(primeiro == null){
            setUltimo(null);
        }
        tamanho--;
        return temp;
    }

    @Override
    public String toString() {
        String s = "fila: ";
        if(estaVazia()) {
            s+= "vazia";
        } else {
            No aux = primeiro;
            do {
                s += aux;
                aux = aux.getProximo();
            } while (aux != null);
        }
        return s + "// \n";
    }
}
