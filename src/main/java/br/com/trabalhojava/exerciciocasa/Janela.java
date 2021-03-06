package br.com.trabalhojava.exerciciocasa;
/**
 * @author Jonathan Lauro mendes de Souza - 202001509194 & Gabriel Ferreira Gomes 202002199369
 */
public class Janela {
    private String dimensao;
    private String material;

    public Janela() {
        this(null,null);
    }

    public Janela(String dimensao, String material) {
        this.dimensao = dimensao;
        this.material = material;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Janela{" +
                "dimensao='" + dimensao + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
