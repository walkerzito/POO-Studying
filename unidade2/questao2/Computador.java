public class Computador extends Equipamento {
    private String marca;
    private String modelo;

    public Computador(String teclado, String mouse, String marca, String modelo) {
        super(teclado, mouse);
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return super.toString()+", Computador [ marca = " + marca + ", modelo = " + modelo + "]";
    }
    
    
}
