package br.com.senaibauru.richard.projeto;

public class Cd extends Produto {
	private String nomeArtista;
	private String selo;
	private int numeroMusicas;
	
	public Cd(int pNrItem, String pNome, 
			int pQtde, double pPreco, int qteMus,
			String nomArt, String sel) {
		//Passando para o constructor da superclass
		super(pNrItem, pNome, pQtde, pPreco);
		nomeArtista = nomArt;
		selo = sel;
		numeroMusicas = qteMus;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getSelo() {
		return selo;
	}

	public void setSelo(String selo) {
		this.selo = selo;
	}

	public int getNumeroMusicas() {
		return numeroMusicas;
	}

	public void setNumeroMusicas(int numeroMusicas) {
		this.numeroMusicas = numeroMusicas;
	}
}
