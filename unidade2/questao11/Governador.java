package unidade2.questao11;

public class Governador extends Politico{
    private String cidade;
    private String estado;
    
    public Governador(String nome, int idade, String partido, String cidade, String estado) {
        super(nome, idade, partido);
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
