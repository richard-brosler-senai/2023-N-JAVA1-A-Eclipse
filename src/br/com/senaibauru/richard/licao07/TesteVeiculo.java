package br.com.senaibauru.richard.licao07;

public class TesteVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo[] veiculos = new Veiculo[3];
		
		veiculos[0] = new Carro(8, 4, 5,"Ford","Ka");
		veiculos[1] = new Moto(4,2,true,"Yamaha","Fazer");
		veiculos[2] = new Veiculo(4,3,"Bizarro","Veiculo Louco");
		
		for (Veiculo vei: veiculos) {
			System.out.println(vei.toString());
		}
		Veiculo veic = new Carro(10,4,3,"Toyota","Ethios Ret");
		System.out.println(veic.toString());
		
	}

}
