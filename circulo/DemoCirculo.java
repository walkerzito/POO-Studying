package circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        System.out.println("Pi: "+ Circulo.pi);

        Circulo c1 = new Circulo(1.0);
        Circulo c2 = new Circulo(2.0);

        System.out.println("Perimetro do circulo 1: "+ c1.perimetro());
        System.out.println("Perimetro do circulo 2: "+ c2.perimetro());
    }
}
