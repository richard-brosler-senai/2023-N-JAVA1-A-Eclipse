package br.com.senaibauru.richard.projeto;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String nome;
		int nrItem,qtdeItem;
		double preco;
		System.out.println("Digite o numero do produto: ");
		nrItem = in.nextInt();
		in.nextLine(); //limpeza do buffer (tira o enter)
		System.out.println("Digite o nome do produto:");
		nome = in.nextLine();
		System.out.println("Digite a quantidade do produto:");
		qtdeItem = in.nextInt();
		System.out.println("Digite o preço do produto:");
		preco = in.nextDouble();
		
		Produto p1 = new Produto();
		p1.setNumeroItem(nrItem);
		p1.setNome(nome);
		p1.setPreco(preco);
		p1.setQtde(qtdeItem);
		System.out.println(p1.toString());
		
		System.out.println("Digite o numero do produto: ");
		nrItem = in.nextInt();
		in.nextLine(); //limpeza do buffer (tira o enter)
		System.out.println("Digite o nome do produto:");
		nome = in.nextLine();
		System.out.println("Digite a quantidade do produto:");
		qtdeItem = in.nextInt();
		System.out.println("Digite o preço do produto:");
		preco = in.nextDouble();
		
		in.close(); //fechando o scanner
		Produto p2 = new Produto();
		p2.setNumeroItem(nrItem);
		p2.setNome(nome);
		p2.setPreco(preco);
		p2.setQtde(qtdeItem);
		p2.setAtivo(false);
		
		System.out.println(p2.toString());
		
		Produto p3 = new Produto(3,"Produto 3",102,17.00);
		System.out.println(p3.toString());

		Produto p4 = new Produto(4,"Produto 4",103,18.00);
		System.out.println(p4.toString());

		Produto p5 = new Produto(5,"Produto 5",104,19.00);
		System.out.println(p5.toString());

		Produto p6 = new Produto(6,"Produto 6",105,20.00);
		System.out.println(p6.toString());
		
	}

}
