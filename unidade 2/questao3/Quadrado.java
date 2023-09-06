public class Quadrado extends FiguraGeometrica {
    private double lados;
    

    public Quadrado(double lados) {
        this.lados = lados;
    }


    @Override
    public void desenha() {
        System.out.println("Desenhando um quadrado com lados de tamanho: "+this.lados+" CM");
    }
}