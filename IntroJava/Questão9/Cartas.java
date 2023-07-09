/*Escreva um programa que lê um número que representa o valor da carta, de um
(ás) a treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus,
3 = copas e 4 = espadas). O programa deve imprimir o nome da carta por
extenso.*/


package Questão9;

import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        int carta, naipe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que representa o valor da carta: ");
        carta = sc.nextInt();
        System.out.println("Digite o numero que representa o naipe da carta: ");
        naipe = sc.nextInt();

        switch (carta) {
            case 1:
            System.out.println("Ás");
            break;
            case 2:
            System.out.println("Dois");
            break;
            case 3:
            System.out.println("Tres");
            break;
            case 4:
            System.out.println("Quatro");
            break;
            case 5:
            System.out.println("Cinco");
            break;
            case 6:
            System.out.println("Seis");
            break;
            case 7:
            System.out.println("Sete");
            break;
            case 8:
            System.out.println("Oito");
            break;
            case 9:
            System.out.println("Nove");
            break;
            case 10:
            System.out.println("Dez");
            break;
            case 11:
            System.out.println("Valete");
            break;
            case 12:
            System.out.println("Rainha");
            break;
            case 13:
            System.out.println("Rei");
            break;
        }

        switch (naipe) {
            case 1:
            System.out.println("Ouro");
            break;
            case 2:
            System.out.println("Paus");
            break;
            case 3:
            System.out.println("Copas");
            break;
            case 4:
            System.out.println("Espada");
            break;
        }
        
        sc.close();
    }
    
}