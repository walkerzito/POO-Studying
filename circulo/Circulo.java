package circulo;

public class Circulo {
    private double raio;
    public static final double pi = 3.1428;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double perimetro(){
        return 2*pi*raio;
    } 
}
