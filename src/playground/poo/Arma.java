package playground.poo;

public class Arma {
	
	private String nome;
	private int municaoPorTiro;
	private int tempoParaRecarregar;
	private int quantidadeDeMunicaoUtilizada;
	private int municaoTotalDaArma;
	private int municaoDisponivel;
			
	public Arma() {
		this.municaoDisponivel = this.municaoTotalDaArma;
	}

	public Arma(String nome, int municaoPorTiro, int tempoParaRecarregar, int municaoDaArma) {
		this.nome = nome;
		this.municaoPorTiro = municaoPorTiro;
		this.tempoParaRecarregar = tempoParaRecarregar;
		this.municaoTotalDaArma = municaoDaArma;
		this.municaoDisponivel = this.municaoTotalDaArma;
	}
	
	public boolean atirar() {
		if(municaoDisponivel >= municaoPorTiro) {
			quantidadeDeMunicaoUtilizada += municaoPorTiro;
			municaoDisponivel -= municaoPorTiro;
			System.out.println("Tiro efetuado");
			return true;
		} else {
			System.out.println("Arma sem munição");
			return false;	
		}
		
	}
	
	public void recarregar() {
		municaoDisponivel = municaoTotalDaArma;
		System.out.println("Arma recarregada");
		
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

	public int getQuantidadeDeMunicaoUtilizada() {
		return quantidadeDeMunicaoUtilizada;
	}

	public int getMunicaoTotalDaArma() {
		return municaoTotalDaArma;
	}

	public void setMunicaoTotalDaArma(int municaoTotalDaArma) {
		this.municaoTotalDaArma = municaoTotalDaArma;
	}

	public int getMunicaoDisponivel() {
		return municaoDisponivel;
	}


	@Override
	public String toString() {
		String descricao = "\nArma: " + getNome() + "\n" +
		"Munição por tiro: " + getMunicaoPorTiro() + "\n" +
		"Tempo para carregar: " + getTempoParaRecarregar() + " segundos\n" +
		"Munição Total da Arma: " + getMunicaoTotalDaArma() + "\n" +
		"Munição utilizada: " + getQuantidadeDeMunicaoUtilizada();
		
		System.out.println(descricao);
		
		return descricao;
	}
	
	

}
