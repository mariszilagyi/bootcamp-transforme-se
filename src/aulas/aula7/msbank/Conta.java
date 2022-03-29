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
	
	public void depositar(double valor) {
		if(valor > 0) saldo += valor;
	}
	
	
	public boolean sacar(double valor) {
		
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
			return true;
		}
		System.out.println("Verifique seu saldo!");
		return false;
	}
	
	public boolean transferir (double valor, Conta contaDestino) {
		
		if(valor > 0 && saldo >= valor) {
			sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("Transferência efetuada com sucesso!");
			return true;
		}
		System.out.println("Verifique seu saldo!");
		return false;
	}
		
	

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


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
