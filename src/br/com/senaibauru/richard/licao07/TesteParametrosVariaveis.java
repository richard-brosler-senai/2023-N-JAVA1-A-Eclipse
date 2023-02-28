package br.com.senaibauru.richard.licao07;

public class TesteParametrosVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mostrando os valores"
				+ " passados para o programa");
		for (String vlr : args) {
			System.out.println(vlr);
		}
		int [] valores = {10,20,30,40};
		int total = calcular(10,20,30,40);
		System.out.println(total);
		
		total = calcular(valores);
		System.out.println(total);
	}
	
	public static int calcular(int... numeros) {
		int ret = 0;
		//foreach
		for(int vlr : numeros) {
			ret += vlr;
		}
		return ret;
	}

}
