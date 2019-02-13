package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_DEPARTAMENTO")
@SequenceGenerator(name = "depart", sequenceName = "SQ_T_DEPARTAMENTO", allocationSize = 1)

public class Departamento {
	
	@Id
	@GeneratedValue(generator = "depart", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_departamento")
	private int 	 codigo;
	
	@Column(name="nm_departamento", nullable = false, length = 100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_criacao")
	private Calendar dataCriacao;
	
	@Column(name="ds_tipo")
	@Enumerated(EnumType.STRING)
	private Tipo 	 tipo;
	
	@Column(name="vl_orcamento")
	private float 	 valorOrcamento;
	
	@Column(name="fl_contrato")
	private byte[]   contrato;
	
	
	public Departamento(int codigo, String nome, Calendar dataCriacao, Tipo tipo, float valorOrcamento,
			byte[] contrato) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.tipo = tipo;
		this.valorOrcamento = valorOrcamento;
		this.contrato = contrato;
	}
	
	public Departamento() {
		super();
	}


	public Departamento(String nome, Calendar dataCriacao, Tipo tipo, float valorOrcamento, byte[] contrato) {
		super();
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.tipo = tipo;
		this.valorOrcamento = valorOrcamento;
		this.contrato = contrato;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData_criacao() {
		return dataCriacao;
	}

	public void setData_criacao(Calendar data_criacao) {
		this.dataCriacao = data_criacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public float getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(float valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public byte[] getFileContrato() {
		return contrato;
	}

	public void setFileContrato(byte[] fileContrato) {
		this.contrato = fileContrato;
	}
	

}
