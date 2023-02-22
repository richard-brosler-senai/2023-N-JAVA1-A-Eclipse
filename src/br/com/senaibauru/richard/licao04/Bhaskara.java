package br.com.senaibauru.richard.licao04;
//Corrigir o cabeçalho da classe com seus dados
/**
 * Classe para calcular a formula de Baskara
 * @author Richard Brosler
 * @version 2023-02-16
 *
 */
public class Bhaskara {
	//Definição dos campos
	private int ladoA;
	private int ladoB;
	private int ladoC;
	private int delta;
	private double x1;
	private double x2;
	private boolean foiCalculado;
	/**
	 * Constructor padrão da Classe
	 */
	public Bhaskara() {
		ladoA = 0;
		ladoB = 0;
		ladoC = 0;
		x1 = 0;
		x2 = 0;
		delta = 0;
		foiCalculado = false;
	}
	/**
	 * Constructor com passagem de valores
	 */
	public Bhaskara(int a, int b, int c) {
		ladoA = a;
		ladoB = b;
		ladoC = c;
		x1 = 0;
		x2 = 0;
		delta = 0;
		foiCalculado = false;
	}
	/**
	 * calcularDelta - Método que irá calcular Delta
	 */
	public void calcularDelta() {
		//Colocar o cálculo Delta nesse método substituindo o zero pela fórmula
		// veja a fórmula nesse link abaixo: 
		// https://mundoeducacao.uol.com.br/matematica/formula-bhaskara.htm
		delta = ladoB * ladoB - 4 * ladoA * ladoC;
	}
	/**
	 * calcularXs - Método que irá calcular os valores de X1 e X2
	 */
	public void calcularXs() {
		x1 = 0;
		x2 = 0;
		foiCalculado = false;
		//Colocar a verificação se pode ser calculado X1 e X2. 
		// Há uma situação que não se pode calcular x1 e x2
		if (delta>-1) {
			//Substituir o zero pela fórmula de calculo de x1 e x2
			x1 = ( - ladoB + Math.sqrt(delta) )/( 2 * ladoA );
			x2 = ( - ladoB - Math.sqrt(delta) )/( 2 * ladoA );
			foiCalculado = true;
		} else {
			System.out.println("Não é possível obter os valores de x1 e x2.");
		}
	}
	// Criando os getters e setters 
	//  Criar os getters e setters dos fields ladoA, ladoB e ladoC
	//  Criar somente os getters dos fields calculado, x1, x2 e delta
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	public int getLadoC() {
		return ladoC;
	}
	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	public int getDelta() {
		return delta;
	}
	public double getX1() {
		return x1;
	}
	public double getX2() {
		return x2;
	}
	public boolean isFoiCalculado() {
		return foiCalculado;
	}
}
