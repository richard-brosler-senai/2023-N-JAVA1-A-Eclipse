package br.com.senaibauru.richard.licao04;

import java.util.Scanner;
//Corrigir o cabeçalho da classe com seus dados
/**
 * Classe Driver para calcular Bhaskara
 * @author Richard Brosler
 * @version 2023-02-10
 *
 */
public class TesteBhaskara {

	public static void main(String[] args) {
		//Definindo o objeto scanner para podermos pedir ao usuário os valores
		Scanner scn = new Scanner(System.in);
		//Criando o objeto de calculo para utilizarmos no teste
		Bhaskara bhaskara = new Bhaskara();
		//Mostramos a mensagem para o usuário pedindo os lados do triângulo
		System.out.println("Bem vindo ao programa de cálculo de Bhaskara");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Por favor, digite os valores solicitados para que o sistema efetue os calculos");
		System.out.println("------------------------------------------------------------------------------");
		//Utilizaremos aqui o print ao invés do println, pois a entrada de dados fica na frente do texto
		System.out.print("Digite o lado A: ");
		int ladoA = scn.nextInt();
		System.out.print("Digite o lado B: ");
		int ladoB = scn.nextInt();
		System.out.print("Digite o lado C: ");
		int ladoC = scn.nextInt();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Por favor, Aguarde alguns instantes, estou calculando Delta, X1 e X2...");
		System.out.println("------------------------------------------------------------------------------");
		//Vamos atribuir os valores ao objeto Bhaskara para calcular
		//Usar os setters dos campos de lados para atribuir os valores aqui abaixo
		bhaskara.setLadoA(ladoA);
		bhaskara.setLadoB(ladoB);
		bhaskara.setLadoC(ladoC);
		//Agora vamos calcular Delta
		bhaskara.calcularDelta();
		//Colocar o getter de delta na informação a ser exibida
		System.out.println("O valor de Delta foi " + bhaskara.getDelta());
		//Agora vamos calcular X1 e X2
		bhaskara.calcularXs();
		//Verificando se foi calculado X1 e X2 para apresentar os valores
		//Ajustar o if para testar usando o getter do foiCalculado
		if (bhaskara.isFoiCalculado()) {
			System.out.println("O valor de X1 foi " + bhaskara.getX1());
			System.out.println("O valor de X2 foi " + bhaskara.getX2());
		} else {
			System.out.println("Não foi possível calcular X1 e X2");
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Obrigado por utilizar nossos serviços! :-)");
		scn.close();
	}
}
