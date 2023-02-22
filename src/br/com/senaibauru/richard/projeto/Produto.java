package br.com.senaibauru.richard.projeto;
//Corrigir o cabeçalho da classe com seus dados
/**
 * Classe Produto do projeto
 * @author Richard Brosler
 * @version 2023-02-16
 */
public class Produto {
	//Definir os campos com seus respectivos tipos
	private int numeroItem;
	private String nome;
	private int qtde;
	private double preco;
	//Criar o constructor da Classe
	public Produto() {
		numeroItem=0;
		nome=null;
		qtde=0;
		preco=0.0;
	}
	public Produto(int pNrItem, String pNome, int pQtde, double pPreco) {
		numeroItem = pNrItem;
		nome = pNome;
		qtde = pQtde;
		preco = pPreco;
	}
	//Criar getters e setters
	public int getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Número do item........: " + numeroItem + 
			 "\nNome..................: " + nome + 
			 "\nQuantidade em estoque.: " + qtde +
			 "\nPreço.................: " + preco;
	}

}
