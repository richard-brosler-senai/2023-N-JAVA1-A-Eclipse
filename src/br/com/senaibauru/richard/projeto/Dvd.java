package br.com.senaibauru.richard.projeto;

public class Dvd extends Produto {
	private int duracao;
	private String classificacao;
	private String estudio;
	
	public Dvd(int pNrItem, String pNome, 
			int pQtde, double pPreco, int dur,
			String clas, String est) {
		super(pNrItem, pNome, pQtde, pPreco);
		duracao = dur;
		classificacao = clas;
		estudio = est;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
}
