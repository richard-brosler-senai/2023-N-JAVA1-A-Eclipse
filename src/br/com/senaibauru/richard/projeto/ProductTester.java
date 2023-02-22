package br.com.senaibauru.richard.projeto;

public class ProductTester {

	public static void main(String[] args) {
		/*
		 * Produtos com o Constructor padrão 
		 */
		//Criando um produto
		Produto prod1 = new Produto();
		prod1.setNome("Caneta Bic Azul");
		prod1.setNumeroItem(1);
		prod1.setPreco(5.10);
		prod1.setQtde(100);
		System.out.println("Produto 1 - Criado :\n" + prod1.toString());
		//Criando o produto 2
		Produto prod2 = new Produto();
		prod2.setNome("Caneta Bic Vermelha");
		prod2.setNumeroItem(2);
		prod2.setPreco(6.20);
		prod2.setQtde(120);
		System.out.println("Produto 2 - Criado :\n" + prod2.toString());
		/*
		 * Produtos com o Constructor com parâmetros
		 */
		Produto prod3 = new Produto(3,"Caneta Bic Verde",110,6.50);
		System.out.println("Produto 3 - Criado :\n" + prod3.toString());
		Produto prod4 = new Produto(4,"Caneta Bic Amarela",90,6.80);
		System.out.println("Produto 4 - Criado :\n" + prod4.toString());
		Produto prod5 = new Produto(5,"Caneta Bic Preta",160,5.00);
		System.out.println("Produto 5 - Criado :\n" + prod5.toString());
		Produto prod6 = new Produto(6,"Caneta Bic Rosa",80,7.50);
		System.out.println("Produto 6 - Criado :\n" + prod6.toString());
		
	}

}
