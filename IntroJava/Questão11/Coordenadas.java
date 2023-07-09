package Questão11;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto: ");
        System.out.println("Ponto 1 - Coordenada X: ");
        int x1 = sc.nextInt();
        System.out.println("Ponto 1 - Coordenada Y: ");
        int y1 = sc.nextInt();

        System.out.println("Digite as coordenadas do segundo ponto: ");
        System.out.println("Ponto 2 - Coordenada X: ");
        int x2 = sc.nextInt();
        System.out.println("Ponto 2 - Coordenada Y: ");
        int y2 = sc.nextInt();

        sc.close();

        if (x2 > x1) {
            System.out.println("O segundo ponto esta a direita do primeiro");
        } else if (x2 < x1) {
            System.out.println("O segundo ponto esta a esquerda do primeiro");
        }

        if (y1 > y2) {
            System.out.println("O segundo ponto esta a direita do primeiro");
        } else if (y1 < y2) {
            System.out.println("O segundo ponto esta a esquerda do primeiro");
        }

        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos estao na mesma posição");
        }
    }
}
