package Und3.Q3;

public class Aluno {
    private int matricula;
    private String nome;
    private double p1;
    private double p2;
    private double t;

    public Aluno(int matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public double media() {
        return (2.5 * p1 + 2.5 * p2 + 2 * t) / 7;
    }

    public double provaFinal() {
        double mp = media();
        
        if (mp < 3 || mp >= 7) {
            return 0;
        } else {
            double mf = (mp * 6) / 10;
            return (5 - mf) * 10 / 4;
        }
    }
}

