package Und3.Q2;

public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(9, 15, 9, 2023, "Reunião de equipe"));
        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(15, 15, 9, 2023, "Entrega do relatório"));

        minhaAgenda.listarDia(15, 9, 2023);
    }
}
