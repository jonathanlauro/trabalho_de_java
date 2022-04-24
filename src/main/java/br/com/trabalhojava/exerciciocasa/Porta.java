package br.com.trabalhojava.exerciciocasa;
/**
 * @author Jonathan Lauro mendes de Souza - 202001509194 & Gabriel Ferreira Gomes 202002199369
 */
public class Porta {
    private Float altura;
    private Float largura;
    private String material;

    public Porta() {
        this(null,null,null);
    }

    public Porta(Float altura, Float largura, String material) {
        this.altura = altura;
        this.largura = largura;
        this.material = material;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", material='" + material + '\'' +
                '}';
    }
}
