public class Matriz {

    private float[][] matriz = new float[2][2];


    public Matriz(float[][] matriz) {
        this.matriz = matriz;
    }

    public void calcularDet(){
        float det = (matriz[0][0]*matriz[1][1]) - (matriz[0][1]*matriz[1][0]);
        System.out.println("O determinante da matriz e: "+det);
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }            
            System.out.println();
        }
    }
}