package br.com.senaibauru.richard.projeto;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int maxSize, menuChoice;
		//Pedindo a quantidade de itens
		maxSize = getNumProducts(scn);
		if (maxSize==0) {
			System.out.println("Obrigado por usar nossos "
					+ "serviços!");
		} else {
			Produto[] produtos = new Produto[maxSize];
			addToInventory(produtos,scn);
		}
	}

	private static void addToInventory(Produto[] produtos, Scanner scn) {
		for(Produto prd: produtos) {
			System.out.println("Você deseja incluir "
					+ "1 - DVD ou 2 - CD?");
			int opc=0;
			do {
				try {
					opc = scn.nextInt();
				} catch (Exception e) {
					System.out.println("Digite valores numéricos");
					scn.nextLine();
				}
				
			}while(opc!=1 && opc!=2);
			//solicitar os dados do produto
			int numeroItem = getValorInteiro("Digite o número do item: ",scn);
			String nome;
			int qtde = getValorInteiro("Digite a Qtde do item: ",scn);
			double preco;
		}
	}

	private static int getValorInteiro(String string, Scanner scn) {
		System.out.println(string);
		int ret=0;
		do {
			try {
				ret = scn.nextInt();
			}catch(Exception e) {
				System.out.println("Favor digitar numeros "
						+ "maiores que zero!");
				scn.nextLine();
			}
		}while(ret>0);
		return ret;
	}

	private static int getNumProducts(Scanner scn) {
		System.out.println("Digite o numero de "
				+ "produtos que você deseja (0 - fim) :");
		int ret=0;
		do {
			try {
				ret = scn.nextInt();
			}catch(Exception e) {
				System.out.println("Favor digitar numeros!");
				scn.nextLine();
			}
		}while(ret>=0);
		return ret;
	}

}
