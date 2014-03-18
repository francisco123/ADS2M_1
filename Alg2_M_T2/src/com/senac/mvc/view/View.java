package com.senac.mvc.view;

import com.senac.mvc.controller.PessoaController;

public class View {
	
	
	public void imprimePessoa(){
	PessoaController p=new PessoaController();
	for(int i=0;i<50;i++){
		System.out.println("Nome: "+p.gerarNome()+" "+p.gerarSobreNome()+"\nEndereco: "+p.gerarEnderecos()+"\nTipo de Telefone: "
				+p.gerarTiposTelefones()+"\nTelefone: "+p.gerarTelefones());
		System.out.println("\n------//------//------");
	}
	}
}	

