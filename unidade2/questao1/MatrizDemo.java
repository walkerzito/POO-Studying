public class MatrizDemo {
    public static void main(String[] args) {
        float[][] teste = {{1,2},{1,1}};
        Matriz m1 = new Matriz(teste);
        m1.calcularDet();
        m1.imprimirMatriz();

    }
}
