package Questão43;

public class Computador extends Equipamento{
    private int quantidadeMemoria;
    private int capacidadeDisco;

    public Computador(String perifericos, String rgb, int quantidadeMemoria, int capacidadeDisco) {
        super(perifericos, rgb);
        this.quantidadeMemoria = quantidadeMemoria;
        this.capacidadeDisco = capacidadeDisco;
    }

    public int getQuantidadeMemoria() {
        return quantidadeMemoria;
    }

    public void setQuantidadeMemoria(int quantidadeMemoria) {
        this.quantidadeMemoria = quantidadeMemoria;
    }

    public int getCapacidadeDisco() {
        return capacidadeDisco;
    }

    public void setCapacidadeDisco(int capacidadeDisco) {
        this.capacidadeDisco = capacidadeDisco;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Perifericos" + getPerifericos();
        res += "RGB" + getRgb();
        res += "Quantidade de Memória: " + getQuantidadeMemoria();
        res += "Capacidade de disco: " + getCapacidadeDisco();
        return res;
    }

    
    
}