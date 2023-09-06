package unidade2.questao10;

import java.util.Date;

class DataHora {
    private Date dataHora;
    
    public DataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
    public Date getDataHora() {
        return dataHora;
    }
    
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
}

class EventoDelegacao {
    private DataHora dataHora;
    private String evento;
    
    public EventoDelegacao(Date dataHora, String evento) {
        this.dataHora = new DataHora(dataHora);
        this.evento = evento;
    }
    
    public Date getDataHora() {
        return dataHora.getDataHora();
    }
    
    public String getEvento() {
        return evento;
    }
    
    public void setDataHora(Date dataHora) {
        this.dataHora.setDataHora(dataHora);
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }
}

class EventoHeranca extends DataHora {
    private String evento;
    
    public EventoHeranca(Date dataHora, String evento) {
        super(dataHora);
        this.evento = evento;
    }
    
    public String getEvento() {
        return evento;
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }
}

public class Teste {
    public static void main(String[] args) {
        Date dataHora = new Date();
        
        EventoDelegacao eventoDelegacao = new EventoDelegacao(dataHora, "Evento de Delegação");
        System.out.println("Evento Delegação:");
        System.out.println("Data e Hora: " + eventoDelegacao.getDataHora());
        System.out.println("Evento: " + eventoDelegacao.getEvento());
        
        EventoHeranca eventoHeranca = new EventoHeranca(dataHora, "Evento de Herança");
        System.out.println("\nEvento Herança:");
        System.out.println("Data e Hora: " + eventoHeranca.getDataHora());
        System.out.println("Evento: " + eventoHeranca.getEvento());
    }
}