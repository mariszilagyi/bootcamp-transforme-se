package playground.streamapi.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Compras {
	
	private Integer codigoCompra;
	private Cliente cliente;
	private Produto produto;
	private static Integer sequencial = 0;
		
	public Compras(Cliente cliente, Produto produto) {
		sequencial++;
		this.cliente = cliente;
		this.produto = produto;
		this.codigoCompra = sequencial;
	}
		
	public Integer getCodigoCompra() {
		return codigoCompra;
	}

	public void setCodigoCompra(Integer codigoCompra) {
		this.codigoCompra = codigoCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	@Override
	public String toString() {
		return "Compras [codigoCompra=" + codigoCompra + ", cliente=" + cliente + ", produto=" + produto + 
				"]";
	}
	

}
