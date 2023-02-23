package br.com.senaibauru.richard.licao05;

import java.util.Scanner;

public class TesteSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 5");
		int vlr = in.nextInt();
		switch(vlr) {
		case 1 -> { //Mais de um comando, preciso de chaves
			System.out.println("Você ganhou uma bala!");
			System.out.println("e também um doce.");
		}
		case 2 -> System.out.println("Você ganhou um chocolate!");
		case 3 -> System.out.println("Você ganhou uma régua!");
		case 4 -> System.out.println("Você perdeu um chocolate!"); 
		case 5 -> System.out.println("Você perdeu tudo!"); 
		default -> System.out.println("Opção inválida!");
		}
		System.out.println("Você digitou " + ( vlr == 2 ? "dois": vlr));
		int vlr2 = vlr * (vlr == 2 ? 5 : 1) + 50;
	}

}
