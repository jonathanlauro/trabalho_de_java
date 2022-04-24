package br.com.trabalhojava.contabancaria.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author Jonathan Lauro mendes de Souza - 202001509194 & Gabriel Ferreira Gomes 202002199369
 */
public class ConversorDeData {

    private ConversorDeData(){
    }

    public static String converterDateToStrig(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }
}
