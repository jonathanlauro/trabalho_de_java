package br.com.trabalhojava.contabancaria;
/**
 * @author Jonathan Lauro mendes de Souza - 202001509194 & Gabriel Ferreira Gomes 202002199369
 */
public class TesteContaBancaria {
    public static void main(String[] args) throws Exception {
        ContaBancaria cb = new ContaBancaria();

        System.out.println("Data de criação nao formatada: " + cb.getDataCriacao());
        System.out.println("Data de criação Formatada: " + cb.getDataAberturaFormatada());

        System.out.println("Saldo antes do deposito: " + cb.getSaldo());
        cb.depositar(4792.75);
        System.out.println("Saldo nao formatado: " + cb.getSaldo());
        System.out.println("Saldo formatado: " + cb.getSaldoFormatado());

        cb.depositar(350.00);
        System.out.println("saldo atual: " + cb.getSaldoFormatado());

        cb.sacar(200.00);

//        System.out.println(cb.getSaldoFormatado());
    }
}
