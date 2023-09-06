package unidade2.questao11;

public class TesteGoverno {
    public static void main(String[] args) {
        Politico politico1 = new Politico("João", 22, "PT");
        Prefeito prefeito1 = new Prefeito("Alan", 20, "PSDB", "Major Salão");
        Governador governador1 = new Governador("Francisco Inácio Lula da Silva", 69, "PT", "Todos");

        System.out.println("Nome do politico: " + politico1.getNome());
        System.out.println("Partido do politico: " + politico1.getPartido());

        System.out.println();

        System.out.println("Nome do prefeito: " + prefeito1.getNome());
        System.out.println("Partido do prefeito: " + prefeito1.getPartido());
        System.out.println("Cidade governada pelo prefeito: " + prefeito1.getCidade());

        System.out.println();
        
        System.out.println("Nome do governador: " + governador1.getNome());

        
    }
}
