package playground.streamapi.exercicios;

public class Produto {
	
	private Integer codigoProduto;
	private String nomeProduto;
	private String marcaProduto;
	private static Integer sequencial = 0;
	
		
	public Produto(String nomeProduto, String marcaProduto) {
		sequencial++;
		this.nomeProduto = nomeProduto;
		this.marcaProduto = marcaProduto;
		this.codigoProduto = sequencial;
	}
		
	public Integer getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public static Integer getSequencial() {
		return sequencial;
	}

	public static void setSequencial(Integer sequencial) {
		Produto.sequencial = sequencial;
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", marcaProduto="
				+ marcaProduto + "]";
	}
	
	
	
	

}
