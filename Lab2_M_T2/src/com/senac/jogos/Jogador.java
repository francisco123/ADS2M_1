package com.senac.jogos;

public class Jogador {
	private int pontos;
	private int pontosJogador2;
	private int pontosJogador3;
	private int pontosJogador4;
	

	public Jogador() {
		pontos = 0;
		pontosJogador2 = 0;
		pontosJogador3 = 0;
		pontosJogador4 = 0;
	}
	public int getPontos() {
		return pontos;
	}
	public void addPontos(int pontos) {
		this.pontos += pontos;
	}
	
	public void addPontos2(int pontosJogador2) {
		this.pontosJogador2 += pontosJogador2;
	}
	
	public void addPontos3(int pontosJogador3) {
		this.pontosJogador3 += pontosJogador3;
	}
	
	public void addPontos4(int pontosJogador4) {
		this.pontosJogador4 += pontosJogador4;
	}
	
	public void subtractPontos(int pontos) {
		this.pontos -= pontos;
	}
	
	public void subtractPontos2(int pontosJogador2) {
		this.pontosJogador2 -= pontosJogador2;
	}
	public void subtractPontos3(int pontosJogador3) {
		this.pontosJogador3 -= pontosJogador3;
	}
	public void subtractPontos4(int pontosJogador4) {
		this.pontosJogador4 -= pontosJogador4;
	}
	public int getPontosJogador2(){
		return pontosJogador2;
	}
	
	public void setPontosJogador2(int pontosJogador2){
		this.pontosJogador2 = pontosJogador2;
	}
	
	public int getPontosJogador3(){
		return pontosJogador3;
	}
	
	public void setPontosJogador3(int pontosJogador3){
		this.pontosJogador3 = pontosJogador3;
	}
	
	public int getPontosJogador4(){
		return pontosJogador4;
	}
	
	public void setPontosJogador4(int pontosJogador4){
		this.pontosJogador4 = pontosJogador4;
	}
	}
