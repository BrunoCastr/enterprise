package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

private float taxa = 2.0f;	
	


public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo) {
	super(agencia, numero, dataAbertura, saldo);
}


public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
	super(agencia, numero, dataAbertura, saldo);
	this.taxa = taxa;
}


public float getTaxa() {
	return taxa;
}


public void setTaxa(float taxa) {
	this.taxa = taxa;
}


public static float getRendimento() {
	return RENDIMENTO;
}


public static final float RENDIMENTO=0.25f;


public void retirarSaldo(double valor)throws Exception {
if(saldo-valor - taxa <0) {
throw new Exception();
}else {this.saldo-=(valor+taxa);}}


@Override
public double calculaRetornoInvestimento() {
return saldo*RENDIMENTO;	
}}
