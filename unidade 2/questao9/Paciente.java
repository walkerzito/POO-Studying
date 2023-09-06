import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Paciente {
    private int rg;
    private int idade;
    
    public Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public class Consultorio {
        public static void main(String[] args) {
            Queue<Paciente> filaPrioritaria = new LinkedList<>();
            Queue<Paciente> filaComum = new LinkedList<>();
            Random random = new Random();
    
            for(int minutos = 1; minutos <= 400; minutos++){
                if(minutos % 4 == 0){
                    int rg = random.nextInt(1000000);
                    int idade = random.nextInt(90) + 1;
                    Paciente novoPaciente = new Paciente(rg, idade);

                    if(idade > 60){
                        filaPrioritaria.offer(novoPaciente);
                    }else {
                        filaComum.offer(novoPaciente);
                    }
                }

                if (minutos % 5 == 0){
                    if (!filaPrioritaria.isEmpty()){
                        Paciente pacienteAtendido = filaPrioritaria.poll();
                        System.out.println("Atendendo paciente (RG:"+ pacienteAtendido.getRg() + ", Idade: " + pacienteAtendido.getIdade() + ")");
                    } else if (!filaComum.isEmpty()){
                        Paciente pacienteAtendido = filaComum.poll();
                        System.out.println("Atendendo paciente (RG:"+ pacienteAtendido.getRg() + ", Idade: " + pacienteAtendido.getIdade() + ")");
                    }
                }
            }
            System.out.println("Fim do dia de atendimento");
        }
    }

}


