public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equip = new Equipamento("Fortrek 2.0", "Razer viper");
        Computador comp = new Computador("Redragon", "Logitec 205", "Lenovo", "Ideaped 415");

        System.out.println(equip.toString());
        System.out.println(comp.toString());
    }
    
}
