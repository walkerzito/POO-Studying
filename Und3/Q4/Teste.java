package Und3.Q4;


import java.util.TreeMap;


public class Teste {
    public static void main(String[] args) {
        String nome = "HELLO THERE";
        TreeMap<Character,Integer> ocorrencias = new TreeMap<>();

        for (int i = 0; i < nome.length() ; i++) {
            Character aux = nome.charAt(i);

            if(ocorrencias.containsKey(aux)){
                int qnt = ocorrencias.get(aux);
                ocorrencias.put(aux, qnt+1);
            }else{
                if(!Character.toString(aux).equals(" ")){
                    ocorrencias.put(aux, 1);
                }
            }
        }

        System.out.println(ocorrencias.toString());
        
       
    }
    
}