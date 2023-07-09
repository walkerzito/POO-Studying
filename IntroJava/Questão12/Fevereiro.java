// O mês de fevereiro de 2015 começou em um domingo. Escreva um programa
// que dado o número de um dia do mês de fevereiro (um valor entre 1 e 28)
// imprime o dia da semana correspondente.
// ● Exemplo de entrada: 10
// ● Exemplo de saída: O dia 10 será uma terça-feira.

package Questão12;

import java.util.Scanner;

public class Fevereiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia (entre 1 e 28) de fevereiro: ");
        int dia = scanner.nextInt();

        scanner.close();

        int mes = 2; // fevereiro
        int ano = 2015;

        int a = (14 - mes) / 12;
        int y = ano - a;
        int m = mes + 12 * a - 2;

        int diaSemana = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        String nomeDiaSemana = "";

        switch (diaSemana) {
            case 0:
                nomeDiaSemana = "Domingo";
                break;
            case 1:
                nomeDiaSemana = "Segunda-feira";
                break;
            case 2:
                nomeDiaSemana = "Terça-feira";
                break;
            case 3:
                nomeDiaSemana = "Quarta-feira";
                break;
            case 4:
                nomeDiaSemana = "Quinta-feira";
                break;
            case 5:
                nomeDiaSemana = "Sexta-feira";
                break;
            case 6:
                nomeDiaSemana = "Sábado";
                break;
        }

        System.out.println("O dia " + dia + " será um(a) " + nomeDiaSemana + ".");
    }
}
