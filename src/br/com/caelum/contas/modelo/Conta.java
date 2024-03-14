package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.Data;

public class Conta implements Comparable<Conta> {
    private String titular;
    private int numero;
    private String agencia;
    protected double saldo;
    private Data dataDeAbertura;

    public Conta() {
    }

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "[titular=" + titular.toUpperCase() + ", numero=" + numero
                + ", agencia=" + agencia + "]";
    }

    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Data getDataDeAbertura() {
        return this.dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void saca (double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar" +
                    " um valor negativo");
        } else {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou depositar" +
                    " um valor negativo");
        } else {
            this.saldo += valor;
        }
    }

    double calculaRendimento() {
        double rendimento = 0.1;
        this.saldo = this.saldo * rendimento;
        return this.saldo;
    }

    String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }

    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }

    //public abstract String getTipo();
}
