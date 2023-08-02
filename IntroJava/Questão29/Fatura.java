package Questão29;

public class Fatura {
    private int numId;
    private String desc;
    private int qnt;
    private Double precoUnt;
    
    public Fatura(int numId, String desc, int qnt, Double precoUnt) {
        this.numId = numId;
        this.desc = desc;
        this.qnt = qnt;
        this.precoUnt = precoUnt;
    }

    public double CalculaTotal(){
        return qnt * precoUnt;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = (qnt > 0) ? qnt : 0;
    }

    public Double getPrecoUnt() {
        return precoUnt;
    }

    public void setPrecoUnt(Double precoUnt) {
        this.precoUnt = (precoUnt > 0.0) ? precoUnt : 0.0;
    }

    
}

