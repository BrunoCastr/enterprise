package br.com.fiap.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaCorrente extends Conta {


private TipoConta tipo;

public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo) {
	super(agencia, numero, dataAbertura, saldo);
}

public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
	super(agencia, numero, dataAbertura, saldo);
	this.tipo = tipo;
}

public TipoConta getTipo() {
	return tipo;
}

public void setTipo(TipoConta tipo) {
	this.tipo = tipo;
}

public void retirarSaldo(double valor)throws Exception {
if(saldo-valor<0 && tipo == TipoConta.COMUM) {
throw new Exception();
}this.saldo-=valor;}

@Override
public String toString() {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
return "Numero: "+getNumero()+"\n"+
	   "Agencia: "+getAgencia()+"\n"+
	   "Tipo Conta: "+tipo+"\n"+
	   "Saldo: "+ saldo +"\n"+
		"Data abertura: "+sdf.format(getDataAbertura().getTime()) +"\n";}}
