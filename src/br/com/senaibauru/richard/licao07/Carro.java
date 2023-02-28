package br.com.senaibauru.richard.licao07;

public class Carro extends Veiculo {
	private int numeroPortas;
	
	public Carro() {
		super();
		setNumeroPortas(0);
	}
	
	public Carro(int cilindradas, int nrRodas,
			     int portas, String marc, String mod) {
		//Chamando o constructor do pai
		super(cilindradas,nrRodas,marc,mod);
		setNumeroPortas(portas);
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	@Override
	public String toString() {
		return "Carro: \n" + super.toString() +
			   "\nQuantidade Portas : " +
				numeroPortas;
	}
}
