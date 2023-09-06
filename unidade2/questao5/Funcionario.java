public class Funcionario {
    private String nome;
    private double salarioPorHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    
}
