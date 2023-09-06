public class Circulo extends FiguraGeometrica {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void desenha() {
        System.out.println("Desenhando um circulo de raio igual a : "+this.raio);
    }
    

}
