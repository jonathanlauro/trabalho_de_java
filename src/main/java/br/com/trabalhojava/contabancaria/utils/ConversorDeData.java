package br.com.trabalhojava.contabancaria.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorDeData {

    private ConversorDeData(){
    }

    public static String converterDateToStrig(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }
}
