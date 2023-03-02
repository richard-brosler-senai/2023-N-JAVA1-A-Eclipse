package br.com.senaibauru.richard.licao08;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa(40,"Roberto");
		Pessoa p2 = p1;
		p2.setNome("Roberval");
		System.out.println(p2.toString());
		System.out.println(p1.toString());
		int a=10;
		int b=a;
		System.out.println(a);
		System.out.println(b);
		b = 15;
		System.out.println(a);
		System.out.println(b);
		String n1 = "Ricardo";
		String n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		n1 = "Roger";
		System.out.println(n1);
		System.out.println(n2);
	}

}
