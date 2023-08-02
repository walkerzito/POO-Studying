package Questão29;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(12, "Teclado Mecanico", 2, 150.0);

        System.out.println("Número de identificação: " + fatura1.getNumId());
        System.out.println("Descrição: " + fatura1.getDesc());
        System.out.println("Quantidade comprada: " + fatura1.getQnt());
        System.out.println("Preço unitário: " + fatura1.getPrecoUnt());
        System.out.println("Valor total da fatura: " + fatura1.CalculaTotal());

        System.out.println();

        Fatura fatura2 = new Fatura(15, "Mouse Gamer", 2, 200.0);

        System.out.println("Número de identificação: " + fatura2.getNumId());
        System.out.println("Descrição: " + fatura2.getDesc());
        System.out.println("Quantidade comprada: " + fatura2.getQnt());
        System.out.println("Preço unitário: " + fatura2.getPrecoUnt());
        System.out.println("Valor total da fatura: " + fatura2.CalculaTotal());
        
    }
}
