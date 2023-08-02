package Questão32;

public class DemoContador {
    public static void main(String[] args) {
        Contador contador1 = new Contador();

        contador1.imprimirValor();

        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();

        contador1.imprimirValor();

        contador1.zerar();

        contador1.imprimirValor();
    }
}
