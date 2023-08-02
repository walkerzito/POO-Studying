package Questão30;

public class Ufersa {
    public String nome;
    public int matricula;
    private double n2;
    private double n1;
    private double nt;
    
    public Ufersa() {
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getNt() {
        return nt;
    }
    public void setNt(double nt) {
        this.nt = nt;
    }


    public double media(){
        return ((n1*2.5)+(n2*2.5)+(nt*2))/7;
    }

    public double provaFinal(){
        if (media() < 7){
            return 21-(3*media()) ;
        } else {
            return 0;
        }
    }
}
