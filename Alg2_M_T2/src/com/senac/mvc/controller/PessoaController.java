package com.senac.mvc.controller;
import java.util.Random;
import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

public class PessoaController {

	//Sortear Nomes
	public String Nome()
	{
		Random rnomes=new Random();
		String nomes[] = {"João","Francisco","Carlos","Vanissa","Vanessa","Carolina","Maria","Luiza","Rita"};
		return nomes[rnomes.nextInt(10)];
	}
	
	//Sortear Sobrenome
	public String sobreNome()
	{
		Random rSobreNomes = new Random();
		String sobreNomes[] = {"da Silva","Oselame","Borges","Almeida","de Freitas","Souza"};
		return sobreNomes[rSobreNomes.nextInt(7)];
	}
	
	//Sortear Endereco
	public String Endereco()
	{
		Random rendereco = new Random();
		String endereco[] = {"Bairro Santa Cecília","Av. Liberdade","Vila Repreza","Bairro São Lucas","Av. Ipiranga","Rua da Repreza"};
		return endereco[rendereco.nextInt(7)];	
	}
	
	//Sortear
	public String Telefone()
	{
		Random rTelefone = new Random();
		String telefone[] = {"93861081","86145778","94156584","81419845","93410800","94574134","81165489","96458535"};
		return telefone[rTelefone.nextInt(9)];
	}
	
	public void criaPessoa(){
			Pessoa p = new Pessoa();
			
			for(int i=0;i < 10;i++);
		
			
			
			
			
	}
	
}
