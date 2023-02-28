package br.com.senaibauru.richard.licao06;

import java.util.Scanner;

public class TesterBaralho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baralho baralho = new Baralho();
		//Definindo 5 cartas para o Jogador
		Carta[] cartasJogador = new Carta[5];
		int totalJogador = 0;
		String nomeJogador;
		//Definindo 5 cartas para a Banca
		Carta[] cartasBanca = new Carta[5];
		int totalBanca = 0;
		//Scanner
		Scanner scn = new Scanner(System.in);
		//Dar as cartas para a banca
		int indice = 0;
		do {
			cartasBanca[indice] = baralho.getCarta();
			totalBanca += cartasBanca[indice].getValor();
			indice++;
		} while(totalBanca<=15 && indice < 5);
		//Iniciando a interação com o usuário
		System.out.println("Bem vindo ao jogo de BlackJack");
		System.out.println("Digite seu nome:");
		nomeJogador = scn.nextLine();
		indice = 0;
		char resp;
		do {
			System.out.println("Deseja uma carta? (S/N)");
			resp = scn.next().charAt(0);
			if (resp=='S' || resp == 's') {
				cartasJogador[indice]=baralho.getCarta();
				totalJogador += cartasJogador[indice].getValor();
				indice++;
				System.out.println("Seu total de pontos é " + 
									totalJogador);
			}
		}while (resp=='S' || resp=='s' && indice < 5);
		//Verificando o ganhador
		if (totalJogador>totalBanca && totalJogador <= 21 || 
				totalBanca > 21) {
			System.out.println("Parabéns " + nomeJogador + 
					" Você ganhou com " + totalJogador);
		} else if (totalJogador == totalBanca) {
			System.out.println("Você empatou com a Banca.");
		} else {
			System.out.println("Você perdeu para a Banca.");
		}
		System.out.println("Banca com " + totalBanca);
		scn.close();
	}

}
