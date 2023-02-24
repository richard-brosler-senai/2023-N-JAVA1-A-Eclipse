package br.com.senaibauru.richard.licao06;
/**
 * Classe Carta para Jogo BlackJack
 * @author Richard Brosler
 * @version 2023-02-23
 *
 */
public class Carta {
	private int naipe;
	private int numero;
	/**
	 * Constructor Carta
	 * @param pNaipe - Inteiro de 1 a 4
	 * @param pNumero - Inteiro de 1 a 13
	 * @throws Exception Tratar a exceção
	 */
	public Carta(int pNaipe, int pNumero) throws Exception {
		if (pNaipe < 1 || pNaipe > 4) {
			throw new Exception("Valor válido Naipe de 1 a 4");
		}
		if (pNumero<1 || pNumero>13) {
			throw new Exception("Valor válido Numero de 1 a 13");
		}
		naipe = pNaipe;
		numero = pNumero;
	}
	/**
	 * Getter de valor da carta
	 * @return Inteiro até valor 10
	 */
	public int getValor() {
		return numero > 10 ? 10 : numero;
	}
	/**
	 * getter Naipe
	 * @return Retorna o texto do Naipe
	 */
	public String getNaipe() {
		switch(naipe) {
		case 1: return "Ouro";
		case 2: return "Copas";
		case 3: return "Espada";
		case 4: return "Paus";
		default : return "Erro";
		}
	}
	
	public String getNumero() {
		switch(numero) {
		case 1: return "As";
		case 2: return "Dois";
		case 3: return "Três";
		case 4: return "Quatro";
		case 5: return "Cinco";
		case 6: return "Seis";
		case 7: return "Sete";
		case 8: return "Oito";
		case 9: return "Nove";
		case 10: return "Dez";
		case 11: return "Valete";
		case 12: return "Rainha";
		case 13: return "Reis";
		default: return "Erro";
		}
	}
}
