package Questão30;

public class DemoUfersa {
    public static void main(String[] args) {
        Ufersa aluno = new Ufersa();
        aluno.setN1(5.0);
        aluno.setN2(3.0);
        aluno.setNt(2);
        aluno.nome = "Lucas";
        aluno.matricula = 2020022770;

        System.out.println(aluno.nome);
        System.out.println(aluno.matricula);
        System.out.println(aluno.media());
        System.out.println(aluno.provaFinal());
    }
}
