package playground.streamapi.exercicios;

public class Cliente {
	
	private Integer codigoCliente;
	private String nomeCliente;
	private String cpfCliente;
	private static Integer sequencial = 0;
	
	
	public Cliente(String nomeCliente, String cpfCliente) {
		sequencial++;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.codigoCliente = sequencial;
	}
	
	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente
				+ "]";
	}
	

}
