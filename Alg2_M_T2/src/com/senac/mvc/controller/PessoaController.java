package com.senac.mvc.controller;
import com.senac.mvc.model.Pessoa;
import java.util.Random;


public class PessoaController extends Pessoa {
	Pessoa p=new Pessoa();

	public PessoaController(){
		
	}
	//Sortear Nomes
	public String gerarNome()
	{
		Random rnomes=new Random();
		String nomes[] = {"João","Francisco","Carlos","Vanissa","Vanessa","Carolina","Maria","Luiza","Rita"};
		return nomes[rnomes.nextInt(9)];
	}
	
	//Sortear Sobrenome
	public String gerarSobreNome()
	{
	
		Random rSobreNomes = new Random();
		String sobreNomes[] = {"da Silva","Oselame","Borges","Almeida","de Freitas","Souza"};
		for(int i=0;i<sobreNomes.length;i++)
		p.setSobreNome(sobreNomes[i]);
		return sobreNomes[rSobreNomes.nextInt(5)];
		
	}
	
	//Sortear Endereco
	public String gerarEnderecos()
	{
		Random rendereco = new Random();
		String endereco[] = {"Bairro Santa Cecília","Av. Liberdade","Vila Repreza","Bairro São Lucas","Av. Ipiranga","Rua da Repreza"};
		return endereco[rendereco.nextInt(6)];
	}
	
	//Sortear
	public String gerarTelefones()
	{
		Random rTelefone = new Random();
		String telefone[] = {"93861081","86145778","94156584","81419845","93410800","94574134","81165489","96458535"};
		return telefone[rTelefone.nextInt(8)];
	}
	
	//Sortear tipo de Telefone
	public String gerarTiposTelefones()
	{
		Random rTipo=new Random();
		String tipoTelefone[] = {"Casa","Trabalho","Celular"};
		return tipoTelefone[rTipo.nextInt(3)];
	}
	
	
	
			
	}
	
