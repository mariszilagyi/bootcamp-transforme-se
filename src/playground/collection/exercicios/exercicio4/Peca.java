package playground.collection.exercicios.exercicio4;

import java.util.List;

public abstract class Peca {
	
	private String marca;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
		
	public abstract void retirada();
	
	@Override
	public String toString() {
		return " Marca: " + marca + " | Modelo: " + modelo;
	}
	
	
	
		






}
