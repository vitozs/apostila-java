package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100.0);
            contas[i] = conta;
        }

        double soma = 0.0;
        for (int i = 0; i < contas.length; i++) {
            soma += contas[i].getSaldo();
        }
        double media = soma / contas.length;
        System.out.println("A média dos saldos é: " + media);
    }
}
