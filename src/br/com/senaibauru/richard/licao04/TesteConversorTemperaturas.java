package br.com.senaibauru.richard.licao04;

import java.util.Scanner;

//Corrigir o cabeçalho da classe com seus dados
/**
 * Classe Driver para calcular Temperaturas
 * @author Richard Brosler
 * @version 2023-02-10
 *
 */
public class TesteConversorTemperaturas {

	public static void main(String[] args) {
		//Definindo o objeto scanner para podermos pedir ao usuário os valores
		Scanner scn = new Scanner(System.in);
		// Por padrão o scanner utiliza as configurações regionais para o separador decimal, no caso do
		// Brasil é a vírgula, ou seja, o usuário tem que digitar com vírgula
		// Se desejar o ponto decimal, basta colocar dessa forma:
		//    Scanner scn = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		// Criando o objeto de calculo para utilizarmos no teste
		ConversorTemperatura conv = new ConversorTemperatura();
		//Mostramos a mensagem para o usuário pedindo os dados para converter as temperaturas
		System.out.println("Bem vindo ao programa de conversor de temperaturas Tabajara");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Por favor, digite os valores solicitados para que o sistema efetue os calculos");
		System.out.println("------------------------------------------------------------------------------");
		//Utilizaremos aqui o print ao invés do println, pois a entrada de dados fica na frente do texto
		System.out.print("Digite a temperatura a ser convertida: ");
		double temperatura = scn.nextDouble();
		System.out.print("Digite qual temperatura é a origem (1-Celsius,2-Fahrenheit,3-Kelvin)..: ");
		int tempOri = scn.nextInt();
		System.out.print("Digite qual temperatura é a destino (1-Celsius,2-Fahrenheit,3-Kelvin).: ");
		int tempDes = scn.nextInt();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Por favor, Aguarde alguns instantes, estou calculando a temperatura");
		System.out.println("------------------------------------------------------------------------------");
		//Vamos atribuir os valores ao objeto conv para calcular a temperatura
		//Usar os setters dos campos para atribuir os valores aqui abaixo
		conv.setTemperatura(temperatura);
		conv.setTipoDestino((byte)tempDes);
		conv.setTipoOrigem((byte)tempOri);
		//Agora vamos calcular a temperatura
		conv.calcularTemperatura();
		//Verificando se a temperatura foi calculada
		if (conv.isFoiCalculado()) {
			System.out.println("A temperatura convertida é "
					+ conv.getResultado());
		} else {
			System.out.println("Não foi calculada a temperatura");
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Obrigado por utilizar nossos serviços! :-)");
		scn.close();
	}

}
