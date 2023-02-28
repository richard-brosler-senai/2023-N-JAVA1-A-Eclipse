package br.com.senaibauru.richard.licao07;

public class Veiculo {
	private int motorCilindradas;
	private int numeroRodas;
	private String marca;
	private String modelo;
	//constructor
	public Veiculo() {
		motorCilindradas = 0;
		numeroRodas = 0;
		marca = null;
		modelo = null;
	}
	//constructor com parametros
	public Veiculo(int cilindradas, int rodas, String mc,
						String mod) {
		this.motorCilindradas = cilindradas;
		this.numeroRodas = rodas;
		//podemos usar o this. ou sem this desde que não seja
		// o mesmo nome do parametro e do campo
		marca = mc;
		modelo = mod;
	}
	@Override
	public String toString() {
		return "Cilindradas : " + motorCilindradas + 
			 "\nNumero de rodas: " + numeroRodas + 
			 "\nMarca: " + marca +
			 "\nModelo: " + modelo;
	}
}
