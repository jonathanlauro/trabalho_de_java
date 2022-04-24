package br.com.trabalhojava.exerciciocasa;

public class Parede {
    private String localizacao;
    private Float altura;

    public Parede() {
        this(null,null);
    }

    public Parede(String localizacao, Float altura) {
        this.localizacao = localizacao;
        this.altura = altura;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Parede{" +
                "localizacao='" + localizacao + '\'' +
                ", altura=" + altura +
                '}';
    }
}
