package br.com.trabalhojava.contabancaria.utils;

import java.text.NumberFormat;
import java.util.Locale;
/**
 * @author Jonathan Lauro mendes de Souza - 202001509194 & Gabriel Ferreira Gomes 202002199369
 */
public class ConversorDeMoeda {

    private ConversorDeMoeda(){
    }

    public static String converterDoubleToMoeda(double valor) {
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        return dinheiro.format(valor);
    }
}
