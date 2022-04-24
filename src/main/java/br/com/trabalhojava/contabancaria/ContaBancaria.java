package br.com.trabalhojava.contabancaria;

import java.util.Date;

import static br.com.trabalhojava.contabancaria.utils.ConversorDeData.converterDateToStrig;
import static br.com.trabalhojava.contabancaria.utils.ConversorDeMoeda.converterDoubleToMoeda;

public class ContaBancaria {
    private double saldo;
    private Date dataCriacao;

    public ContaBancaria() {
        this.saldo = 0.0;
        this.dataCriacao = new Date();
    }

    public String getDataAberturaFormatada() {
        return converterDateToStrig(this.dataCriacao);
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getSaldoFormatado(){
        return converterDoubleToMoeda(this.saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado com sucesso! " + valor);
    }
    public double sacar(double valor) throws Exception {
            if(valor > this.saldo) {
                throw new Exception("Saldo insuficiente.");
            }else {
                this.saldo -= valor;
                System.out.println("Procedimento realizado com sucesso. Valor do saque:  R$ "+ valor +" Saldo atual de: " + this.getSaldoFormatado());
                return valor;
            }
    }
}
