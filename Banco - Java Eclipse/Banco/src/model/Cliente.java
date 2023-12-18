package model;

import java.util.Date;

import helper.Utils;

public class Cliente {
	private static int contador = 101;
	
	private int codigo;
	private String nome;
	private String email;
	private String cpf;
	private Date datanascimento;
	private Date dataCadastro;
	
	
	public Cliente(String nome, String email, String cpf, Date datanascimento) {
		
		this.codigo = Cliente.contador;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.datanascimento = datanascimento;
		this.dataCadastro = new Date();
		Cliente.contador += 1;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	
	public String toString() {
		return "Código: " + this.getCodigo() +
				"Nome: " + this.getNome() +
				"E-mail: " + this.getEmail() +
				"CPF: " + this.getCpf() +
				"Data de Nascimento: " + Utils.dateParaString(this.getDatanascimento()) +
				"Data de Cadastro: " + Utils.dateParaString(this.getDataCadastro());
	}
	
	
}
