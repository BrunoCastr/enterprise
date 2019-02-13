package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Teste {

	public static void main(String[] args) {
	
		
	Calendar data = new GregorianCalendar(2018,Calendar.MAY,21);	
	
	ContaPoupanca p = new ContaPoupanca(0, 0, data, 0, 0);
	ContaCorrente c = new ContaCorrente(0, 0, data, 0, TipoConta.PREMIUM);
		
	List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
	
	lista.add(new ContaCorrente (1, 1, data, 11, TipoConta.PREMIUM));
	lista.add(new ContaCorrente (2, 2, data, 22, TipoConta.COMUM));
	lista.add(new ContaCorrente (3, 3, data, 33, TipoConta.PREMIUM));
	
	for (ContaCorrente v : lista) {
	System.out.println(v);}
	}

}
