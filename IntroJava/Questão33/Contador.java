package Questão33;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void incrementa() {
        this.valor++;
    }

    public void decrementa() {
        this.valor--;
    }

    public int getValor() {
        return this.valor;
    }
}
