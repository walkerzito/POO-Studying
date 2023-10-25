package Und3.Q2;

import java.util.ArrayList;

class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda entrada) {
        compromissos.add(entrada);
    }

    public void listarDia(int dia, int mes, int ano) {
        System.out.println("Compromissos para " + dia + "/" + mes + "/" + ano + ":");

        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada.toString());
            }
        }
    }
}
