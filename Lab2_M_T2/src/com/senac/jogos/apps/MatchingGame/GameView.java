package com.senac.jogos.apps.MatchingGame;

import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Carta;

import static java.lang.System.out;

public class GameView {

	private Scanner teclado = new Scanner(System.in);
	
	public String getUserInput()
	{
		return teclado.nextLine();
	}
	
	public void mostraCarta(Carta carta) {
		out.println(String.format("Carta: %d%c",
				                  carta.getNumero(),
				                  carta.getNaipe()));
	}
	
	public void mostraJogador(Jogador jogador) {
		out.println("Jogador 1 "+"\nPontos: "+ jogador.getPontos());
	}
	public void mostraJogador2(Jogador jogador2) {
		out.println("\n\nJogador 2 "+"\nPontos: "+ jogador2.getPontosJogador2());
		
	}
}
