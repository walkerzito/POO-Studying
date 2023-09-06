public class Principal3 {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(10);
        Triangulo t1 = new Triangulo("retangulo");
        Circulo c1 = new Circulo(20.5);

        q1.desenha();
        t1.desenha();
        c1.desenha();
    }
}
