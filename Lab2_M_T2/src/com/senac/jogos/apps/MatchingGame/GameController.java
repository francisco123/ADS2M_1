package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {

	private MatchingGame game;
	private Baralho baralho;
	private Jogador jogador;
	private Jogador jogador2;
	private Jogador jogador3;
	private Jogador jogador4;
	private GameView view;
	
	public GameController() {
		jogador = new Jogador();
		jogador2 = new Jogador();
		jogador3 = new Jogador();
		jogador4 = new Jogador();
		baralho = new Baralho();
		game = new MatchingGame(baralho.drawCarta());
		view = new GameView();
	}

	public void proximoJogador(){
		
		
	}
	public void realizaJogada() {
		
		if (view.getUserInput().equalsIgnoreCase("jogar")) {
			Carta comprada = baralho.drawCarta();
			view.mostraCarta(comprada);
			int score = game.matchCards(comprada);
			jogador.addPontos(score);
			game.setMesa(comprada);
			
		}
		
			
	}

	public boolean isOver() {
		return baralho.isEmpty();
	}

	public void showStatus() {
		view.mostraJogador(jogador);
		view.mostraCarta(game.getMesa());
	}
	
}





