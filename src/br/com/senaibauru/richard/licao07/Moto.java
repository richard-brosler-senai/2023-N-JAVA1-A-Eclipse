package br.com.senaibauru.richard.licao07;

public class Moto extends Veiculo {
	private boolean guidao;
	
	public Moto() {
		super();
		setGuidao(true);
	}
	
	public Moto(int cili, int nrRodas, 
			boolean gui, String mac, String mod) {
		super(cili,nrRodas,mac,mod);
		setGuidao(gui);
	}

	public boolean isGuidao() {
		return guidao;
	}

	public void setGuidao(boolean guidao) {
		this.guidao = guidao;
	}
	@Override
	public String toString() {
		return "Moto: \n" + super.toString() + 
			   "\nTem guidão? " + guidao;
	}
}
