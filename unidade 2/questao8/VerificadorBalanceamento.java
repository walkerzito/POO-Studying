import java.util.Stack;

public class VerificadorBalanceamento {
    public static boolean VerificaBalanceamento (String entrada){
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < entrada.length(); i++){
            Character caractere = entrada.charAt(i);
            
            if (caractere.equals('(')){
                pilha.push(caractere);
            } else if (caractere.equals(')')){
                if (pilha.isEmpty() || pilha.pop() != '('){
                    return false;
                }
            }
        }

        return pilha.empty();

    }

    public static void main(String[] args) {
        String entrada = "))(())";
        String entrada2 = "((()))";

        boolean balanceado = VerificaBalanceamento(entrada);
        boolean balanceado2 = VerificaBalanceamento(entrada2);

        if (balanceado) {
            System.out.println("A string está balanceada.");
        } else {
            System.out.println("A string está desbalanceada.");
        }

        if (balanceado2){
            System.out.println("A string está balanceada.");
        } else {
            System.out.println("A string está desbalanceada.");
        }
    }
}
