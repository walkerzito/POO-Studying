package Questão32;

public class Contador {
   private int Valorcontador;

   public Contador(){
    Valorcontador = 0;
   }

   public void zerar(){
    Valorcontador = 0;
   }

   public void incrementar(){
    Valorcontador++;
   }

   public void imprimirValor(){
    System.out.println("Valor do contador: " + Valorcontador);
   }
}
