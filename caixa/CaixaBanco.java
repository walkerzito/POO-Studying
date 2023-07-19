package caixa;

public class CaixaBanco {
    private int numeroCaixa;
    private static int clientesAtendidos = 0;


    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento (){
        clientesAtendidos++;
        System.out.println("Caixa " + numeroCaixa + " atendeu o cliente" + clientesAtendidos);
    }
}
