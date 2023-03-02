package br.com.senaibauru.richard.licao08;

public class Pessoa {
	private int idade;
	private String nome;
	public Pessoa(int id, String nm) {
		idade = id;
		nome = nm;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + " idade:" + idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
