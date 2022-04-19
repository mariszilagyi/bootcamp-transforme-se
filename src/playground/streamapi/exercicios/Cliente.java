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

	
	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente
				+ "]";
	}
	

}
