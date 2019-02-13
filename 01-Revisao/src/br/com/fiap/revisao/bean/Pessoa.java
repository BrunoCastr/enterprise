package br.com.fiap.revisao.bean;

/*classe abstrata -> nao pode ser instanciado (base para as outras)
 * pode conter metodos abstratos
Final nao permite heranca*/

public abstract class Pessoa {
	
private String nome;
public abstract void cadasrar();

public String getNome() {
return nome;}

public void setNome(String nome) {
this.nome = nome;}

	
	

}
