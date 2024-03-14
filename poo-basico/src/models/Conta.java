package models;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data data_abertura;

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }
    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }
    public double calcularRendimento(){
        return saldo*0.1;
    }

    public void dadosParaImpressao(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("models.Data de abertura: " + data_abertura.dia + '/' + data_abertura.mes + '/' + data_abertura.ano);
        System.out.println("Rendimento: " + calcularRendimento());

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Data getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Data data_abertura) {
        this.data_abertura = data_abertura;
    }
}
