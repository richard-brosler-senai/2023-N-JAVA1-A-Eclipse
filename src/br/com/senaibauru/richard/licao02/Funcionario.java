package br.com.senaibauru.richard.licao02;

public class Funcionario {
	private int id;
	private String nome;
	private String endereco;
	private double salario;
	private double despesas;
	public Funcionario() {
		id = 0;
		nome = null;
		endereco = null;
		salario = 0;
		despesas = 0;
	}
	@Override
	public String toString() {
		return "id: " + id + 
				"\nNome: " + nome +
				"\nEndereço: " + endereco+
				"\nSalário: " + salario + 
				"\nDespesas: " + despesas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getDespesas() {
		return despesas;
	}
	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}
	
}
