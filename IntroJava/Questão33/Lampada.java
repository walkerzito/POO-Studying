package Questão33;

public class Lampada {
    private String estadoDaLampada;
    private int numeroDeVezesAcesa;
    private Contador contador;

    public Lampada() {
        this.estadoDaLampada = "desligado";
        this.numeroDeVezesAcesa = 0;
        this.contador = new Contador();
    }

    public void acende() {
        if (!estaLigada()) {
            this.estadoDaLampada = "ligado";
            this.numeroDeVezesAcesa++;
            this.contador.incrementa();
        }
    }

    public void apaga() {
        if (estaLigada()) {
            this.estadoDaLampada = "desligado";
        }
    }

    public void mostraEstado() {
        System.out.println("A lâmpada está " + this.estadoDaLampada);
    }

    public boolean estaLigada() {
        return this.estadoDaLampada.equals("ligado");
    }

    public int getNumeroDeVezesAcesa() {
        return this.numeroDeVezesAcesa;
    }

    public Contador getContador() {
        return this.contador;
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.mostraEstado(); // A lâmpada está desligada

        lampada.acende();
        lampada.mostraEstado(); // A lâmpada está ligada

        lampada.acende();
        lampada.mostraEstado(); // A lâmpada está ligada

        lampada.apaga();
        lampada.mostraEstado(); // A lâmpada está desligada

        System.out.println("Número de vezes que a lâmpada foi acesa: " + lampada.getNumeroDeVezesAcesa()); // 2

        Contador contador = lampada.getContador();
        System.out.println("Valor atual do contador: " + contador.getValor()); // 2
    }
}
