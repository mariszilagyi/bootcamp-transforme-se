package aulas.aula7.msbank;

public class Conta {
	//atributos
	private int agencia;
	private int numeroConta;
	private double saldo;
	private String titular;


	//construtores
	public Conta() { //padrao
	
	}

	public Conta(int agencia, int numeroConta, String titular) { //sobrecarregado
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	//metodos

	//encapsulamentos
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
