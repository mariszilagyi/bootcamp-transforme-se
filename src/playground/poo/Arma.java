package playground.poo;

public class Arma {
	
	private String nome;
	private int municaoPorTiro;
	private int tempoParaRecarregar;
	
		
	public Arma() {
		super();
	}


	public Arma(String nome, int municaoPorTiro, int tempoParaRecarregar) {
		super();
		this.nome = nome;
		this.municaoPorTiro = municaoPorTiro;
		this.tempoParaRecarregar = tempoParaRecarregar;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMunicaoPorTiro() {
		return municaoPorTiro;
	}

	public void setMunicaoPorTiro(int municaoPorTiro) {
		this.municaoPorTiro = municaoPorTiro;
	}

	public int getTempoParaRecarregar() {
		return tempoParaRecarregar;
	}

	public void setTempoParaRecarregar(int tempoParaRecarregar) {
		this.tempoParaRecarregar = tempoParaRecarregar;
	}

	public void atirar() {
				
	}
	
	public void recarregar() {
		
	}


	@Override
	public String toString() {
		String descricao = "Arma: " + getNome() + "\n" +
		"Munição por tiro: " + getMunicaoPorTiro() + "\n" +
		"Tempo para carregar: " + getTempoParaRecarregar() + "\n\n";
		System.out.println(descricao);
		
		return descricao;
	}
	
	

}
