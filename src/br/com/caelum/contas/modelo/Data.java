package br.com.caelum.contas.modelo;

class Data {
    int dia;
    int mes;
    int ano;

    String formatada(){
        return (this.dia+"/"+this.mes+"/"+this.ano);
    }
}
