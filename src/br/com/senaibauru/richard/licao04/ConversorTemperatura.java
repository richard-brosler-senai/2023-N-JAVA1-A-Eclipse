package br.com.senaibauru.richard.licao04;
//Corrigir o cabeçalho da classe com seus dados
/**
 * Classe de conversão de temperaturas
 * @author Richard Brosler
 * @version 2023-02-16
 * 
 */
public class ConversorTemperatura {
	private double temperatura;
	private double resultado;
	private byte tipoOrigem;  //utilizaremos 1-Celsius, 2-Fahrenheit ou 3-Kelvin
	private byte tipoDestino; //utilizaremos 1-Celsius, 2-Fahrenheit ou 3-Kelvin
	private boolean foiCalculado;
	/**
	 * Constructor ConversorTemperatura
	 */
	public ConversorTemperatura() {
		temperatura = 0;
		resultado = 0;
		tipoOrigem = 1; //vamos deixar o origem como Celsius
		tipoDestino = 1; //vamos deixar o origem como Celsius
		foiCalculado = true;
	}
	/**
	 * calcularTemperatura - Método para calcular a temperatura resultante
	 */
	public void calcularTemperatura() {
		/*
		 * Para os calculos utilize a razão de proporção descrita nessa página:
		 * https://mundoeducacao.uol.com.br/fisica/transformacao-variacao-temperatura.htm
		 */
		foiCalculado = false;
		//se a temperatura origem for igual a temperatura destino, não precisamos testar, o resultado é o 
		//mesmo da temperatura informada
		resultado = temperatura;
		//Inicio dos testes
		switch(tipoOrigem) {
		//Calculando de Celsius para outras temperaturas
		case 1:
			switch(tipoDestino) {
			case 2: resultado = (9 * temperatura + 5 * 32) / 5; //colocar a formula de celsius para Fahrenheit 
					break;
			case 3: resultado = temperatura + 273; //colocar a formula de celsius para Kelvin
					break;
			}
			break; //break do case 1
		//Calculando de Fahrenheit para outras temperaturas
		case 2:
			switch(tipoDestino) {
			case 1: resultado = ( 5 * temperatura - 32 * 5 ) / 9; //TODO: colocar a formula de Fahrenheit para Celsius
					break;
			case 3: resultado = ( 5 * temperatura - 32 * 5 ) / 9 + 273; //TODO: colocar a formula de Fahrenheit para Kelvin
					break;
			}
			break; //break do case 2
		//Calculando de Kelvin para outras temperaturas
		case 3:
			switch(tipoDestino) {
			case 1: resultado = temperatura - 273; //TODO: colocar a formula de Kelvin para Celsius
					break;
			case 2: resultado = ( temperatura * 9 - 273 * 9 ) / 5 + 32; //TODO: colocar a formula de Kelvin para Fahrenheit
					break;
			}
			break; //break do case 3
		}
		//Indicando que foi calculado
		foiCalculado = true;
	}
	//Criar os getters e setters dos campos, exceto o campo calculado e resultado
	//Criar o getter de resultado e calculado
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public byte getTipoOrigem() {
		return tipoOrigem;
	}
	public void setTipoOrigem(byte tipoOrigem) {
		this.tipoOrigem = tipoOrigem;
	}
	public byte getTipoDestino() {
		return tipoDestino;
	}
	public void setTipoDestino(byte tipoDestino) {
		this.tipoDestino = tipoDestino;
	}
	public double getResultado() {
		return resultado;
	}
	public boolean isFoiCalculado() {
		return foiCalculado;
	}
}
