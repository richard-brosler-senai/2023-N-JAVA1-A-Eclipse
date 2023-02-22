package br.com.senaibauru.richard.licao02;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario fun = new Funcionario();
		fun.setId(10);
		fun.setNome("Roberto Carlos");
		fun.setEndereco("Rua das couves, 15");
		fun.setSalario(5700);
		fun.setDespesas(2300.30);
		System.out.println("Id :" + fun.getId());
		System.out.println(fun.toString());
		
	}

}
