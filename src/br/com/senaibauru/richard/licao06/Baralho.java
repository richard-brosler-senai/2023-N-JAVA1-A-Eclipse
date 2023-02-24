package br.com.senaibauru.richard.licao06;

import java.util.Random;

/**
 * Classe Baralho
 * 
 * @author Richard Brosler
 * @version 2023-02-23
 *
 */
public class Baralho {
	private Carta[] cartas;
	private boolean[] cartaUtilizada;
	private Random rnd;

	public Baralho() {
		cartas = new Carta[52];
		cartaUtilizada = new boolean[52];
		rnd = new Random();
		for (int indice = 0; indice < 52; indice++) {
			try {
				cartas[indice] = new Carta(indice / 13 + 1, indice % 13 + 1);
				cartaUtilizada[indice] = false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Carta getCarta() {
		Carta retorno = null;
		do {
			int indice = rnd.nextInt(52);
			if (!cartaUtilizada[indice]) {
				retorno = cartas[indice];
				cartaUtilizada[indice] = true;
			}
		} while (retorno == null);
		return retorno;
	}
	
	public int getQtdeCartasDisponiveis() {
		int retorno=0;
		for(int indice=0;indice<52;indice++) {
			if (!cartaUtilizada[indice])
				retorno++;
		}
		return retorno;
	}
	
	public void reiniciarBaralho() {
		for(int indice=0;indice<52;indice++) {
			cartaUtilizada[indice] = false;
		}
	}
	
	public void embaralhar() {
		rnd.setSeed(System.currentTimeMillis());
	}
}
