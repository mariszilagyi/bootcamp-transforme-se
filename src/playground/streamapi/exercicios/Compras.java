package playground.streamapi.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Compras {
	
	private Integer codigoCompra;
	private Cliente cliente;
	private Produto produto;
	private Double valor;
	private static Integer sequencial = 0;
		
	public Compras(Cliente cliente, Produto produto, Double valor) {
		sequencial++;
		this.cliente = cliente;
		this.produto = produto;
		this.valor = valor;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Compras [codigoCompra=" + codigoCompra + ", cliente=" + cliente + ", produto=" + produto + ", valor="
				+ valor + "]";
	}
	

}
