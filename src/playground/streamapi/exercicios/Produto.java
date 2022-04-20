package playground.streamapi.exercicios;

public class Produto {
	
	private Integer codigoProduto;
	private String nomeProduto;
	private String marcaProduto;
	private Integer valorProduto;

	private static Integer sequencial = 0;
	
		
	public Produto(String nomeProduto, String marcaProduto, Integer valorProduto) {
		sequencial++;
		this.nomeProduto = nomeProduto;
		this.marcaProduto = marcaProduto;
		this.codigoProduto = sequencial;
		this.valorProduto = valorProduto;
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

	public Integer getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Integer valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", marcaProduto="
				+ marcaProduto + "]";
	}
	
	
	
	

}
