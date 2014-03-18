package com.senac.mvc.model;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String telefoneTipo;
	private String sobreNome;
	
	
	
	//Getters and Setters
	public String getSobreNome(){
		return sobreNome;
	}
	public void setSobreNome(String sobreNome){
		this.sobreNome= sobreNome;
	}
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getTelefoneTipo() {
		return telefoneTipo;
	}
	
	public void setTelefoneTipo(String telefoneTipo) {
		this.telefoneTipo = telefoneTipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
