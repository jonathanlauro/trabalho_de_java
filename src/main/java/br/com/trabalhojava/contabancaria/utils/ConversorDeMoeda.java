package br.com.trabalhojava.contabancaria.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class ConversorDeMoeda {

    private ConversorDeMoeda(){
    }

    public static String converterDoubleToMoeda(double valor) {
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        return dinheiro.format(valor);
    }
}
