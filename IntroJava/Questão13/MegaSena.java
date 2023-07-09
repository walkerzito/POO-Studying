// Escreva um programa para imprimir uma versão aproximada de um cartão da
// Mega-Sena (somente com os números, respeitando o número de linhas e a
// distribuição dos números nas linhas).

package Questão13;

public class MegaSena {
        public static void main(String[] args) {
            int[][] cartao = gerarCartaoMegaSena();
    
            imprimirCartaoMegaSena(cartao);
        }
    
        public static int[][] gerarCartaoMegaSena() {
            int[][] cartao = new int[6][10];
    
            for (int i = 0; i < cartao.length; i++) {
                for (int j = 0; j < cartao[i].length; j++) {
                    int numero = (i * 10) + j + 1;
                    cartao[i][j] = numero;
                }
            }
    
            return cartao;
        }
    
        public static void imprimirCartaoMegaSena(int[][] cartao) {
            for (int i = 0; i < cartao.length; i++) {
                for (int j = 0; j < cartao[i].length; j++) {
                    int numero = cartao[i][j];
                    System.out.printf("%2d ", numero);
                }
                System.out.println();
            }
        }
    }
