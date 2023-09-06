public class Equipamento {
    private String teclado;
    private String mouse;

    public Equipamento(String teclado, String mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }
    
    public String getTeclado() {
        return teclado;
    }
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Equipamentos [ teclado = " + teclado + ", mouse = " + mouse + "]";
    } 
    
    
}