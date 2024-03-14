package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.LinkedList;
import java.util.List;

public class TestaArrays {
    public static void main(String[] args) {
        List<Conta> contas = new LinkedList<Conta>();

        for (int i = 0; i < contas.size(); i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100.0);
            contas.set(i, conta);
        }

        double soma = 0.0;
        for (int i = 0; i < contas.size(); i++) {
            soma += contas.get(i).getSaldo();
        }
        double media = soma / contas.size();
        System.out.println("A média dos saldos é: " + media);
    }
}
