package br.com.senaibauru.richard.licao05;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num = in.nextInt();
		//para retirar o buffer do enter
		in.nextLine();
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		System.out.println("Olá," + nome);
		in.close();
	}

}
