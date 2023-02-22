package br.com.senaibauru.richard.licao03;

import java.util.Scanner;

public class ConversoesDados {

	public static void main(String[] args) {
		String nome1, nome2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Entre com o nome1:");
		nome1 = scn.nextLine();
		System.out.println("Entre com o nome2:");
		nome2 = scn.nextLine();
		if (nome1 == nome2) {
			System.out.println("São idênticos!");
		} else {
			System.out.println("Não são idênticos!");
		}
		scn.close();
	}

}
