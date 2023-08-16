package Questão43;

public class Equipamento {
    private String perifericos;
    private String rgb;
    
    public Equipamento(String perifericos, String rgb) {
        this.perifericos = perifericos;
        this.rgb = rgb;
    }

    public String getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(String perifericos) {
        this.perifericos = perifericos;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Equipamento perifericos= " + perifericos + ", rgb=" + rgb + "";
    }

    
}
