package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

import java.util.Collections;
import java.util.List;

public class ManipuladorDeContas {

    private Conta conta;

    public void criaConta(Evento evento){
        Conta conta1 = new Conta();
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));
    }


}