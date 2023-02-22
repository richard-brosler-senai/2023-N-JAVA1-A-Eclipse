package br.com.senaibauru.richard.licao01;

import java.util.Scanner;

public class ConverterGalaoEmLitrosV2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Favor digitar a quantidade de galões:");
		
		double valorGalao = 3.465; //litros
		double galao = scn.nextDouble(); //galoes de teste
		double totalLitros = galao * valorGalao;
		System.out.println("Total de litros = " + totalLitros);
		scn.close();

	}
}
