package br.com.trabalhojava.exerciciocasa;

import java.util.List;
/**
 * @author Jonathan Lauro mendes de Souza - 202001509194 & Gabriel Ferreira Gomes 202002199369
 */
public class Casa {
    private String cor;
    private Float tamanhoDaCasaEmMetrosQuadrados;
    private List<Janela> janelas;
    private List<Porta> portas;
    private List<Parede> paredes;

    public Casa() {
        this(null,null,null,null,null);
    }

    public Casa(String cor, Float tamanhoDaCasaEmMetrosQuadrados, List<Janela> janelas, List<Porta> portas, List<Parede> paredes) {
        this.cor = cor;
        this.tamanhoDaCasaEmMetrosQuadrados = tamanhoDaCasaEmMetrosQuadrados;
        this.janelas = janelas;
        this.portas = portas;
        this.paredes = paredes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getTamanhoDaCasaEmMetrosQuadrados() {
        return tamanhoDaCasaEmMetrosQuadrados;
    }

    public void setTamanhoDaCasaEmMetrosQuadrados(Float tamanhoDaCasaEmMetrosQuadrados) {
        this.tamanhoDaCasaEmMetrosQuadrados = tamanhoDaCasaEmMetrosQuadrados;
    }

    public List<Janela> getJanelas() {
        return janelas;
    }

    public void setJanelas(List<Janela> janelas) {
        this.janelas = janelas;
    }

    public List<Porta> getPortas() {
        return portas;
    }

    public void setPortas(List<Porta> portas) {
        this.portas = portas;
    }

    public List<Parede> getParedes() {
        return paredes;
    }

    public void setParedes(List<Parede> paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "cor='" + cor + '\'' +
                ", tamanhoDaCasaEmMetrosQuadrados=" + tamanhoDaCasaEmMetrosQuadrados +
                ", janelas=" + janelas +
                ", portas=" + portas +
                ", paredes=" + paredes +
                '}';
    }
}
