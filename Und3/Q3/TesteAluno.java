package Und3.Q3;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Lucas", 5.0, 6.0, 7.0);
        Aluno aluno2 = new Aluno(2, "Pedro", 3.0, 2.5, 6.0);
        Aluno aluno3 = new Aluno(3, "João", 7.0, 8.0, 6.5);

        System.out.println("Aluno 1:");
        System.out.println("Média: " + aluno1.media());
        double ef1 = aluno1.provaFinal();
        if (ef1 == 0) {
            System.out.println("Não precisa de exame final.");
        } else {
            System.out.println("Precisa de " + ef1 + " no exame final.");
        }

        System.out.println("\nAluno 2:");
        System.out.println("Média: " + aluno2.media());
        double ef2 = aluno2.provaFinal();
        if (ef2 == 0) {
            System.out.println("Não precisa de exame final.");
        } else {
            System.out.println("Precisa de " + ef2 + " no exame final.");
        }

        System.out.println("\nAluno 3:");
        System.out.println("Média: " + aluno3.media());
        double ef3 = aluno3.provaFinal();
        if (ef3 == 0) {
            System.out.println("Não precisa de exame final.");
        } else {
            System.out.println("Precisa de " + ef3 + " no exame final.");
        }
    }
}

