package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Nivel;

public class Teste {

	public static void main(String[] args) {

		// Criar a fabrica de Enity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		// Criar o gerenciador de entidades
		EntityManager em = fabrica.createEntityManager();

		// CADASTRO
		Funcionario func = new Funcionario("Humberto", 1000, new GregorianCalendar(2010, Calendar.AUGUST, 2), null,
				Nivel.ESTAGIO);

		em.persist(func);
		em.getTransaction().begin();
		em.getTransaction().commit();

		// PESQUISA POR CÓDIGO
		Funcionario busca = em.find(Funcionario.class, 1);
		System.out.println(busca);

		// ATUALIZACAO
		busca.setNome("Rodrigo");
		em.getTransaction().begin();
		em.getTransaction().commit();

		Funcionario atualizacao = new Funcionario(2, "Alice", 10000, new GregorianCalendar(2010, Calendar.AUGUST, 2), null, Nivel.SENIOR);
		
		em.merge(atualizacao);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//REMOCAO
		Funcionario remove = em.find(Funcionario.class, 2);
		em.remove(remove);
		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		fabrica.close();
	}

}
