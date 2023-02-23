package br.com.senaibauru.richard.licao05;

import java.util.Scanner;

public class TesteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 5");
		int vlr = in.nextInt();
		switch(vlr) {
		case 1: System.out.println("Você ganhou uma bala!");break;
		case 2: System.out.println("Você ganhou um chocolate!");break;
		case 3: System.out.println("Você ganhou uma régua!");break;
		case 4: System.out.println("Você perdeu um chocolate!"); break;
		case 5: System.out.println("Você perdeu tudo!"); break;
		default: System.out.println("Opção inválida!");
		}
	}

}
