package aulas.aula7.msbank;

public class ContaCorrente extends Conta {

	
	private double limite;
	private double saldoDisponivel;
	
	public ContaCorrente() {
		
		this.limite = 500; 

	}
	
	@Override
	public void sacar(double valor) {
		
		if(valor > 0 && getSaldoDisponivel() >= valor) {
			saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
		
		}
		else {System.out.println("Verifique seu saldo!");}
		
	}
	
	@Override
	public void transferir (double valor, Conta contaDestino) {
		
		if(valor > 0 && getSaldoDisponivel() >= valor) {
			sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("Transferência efetuada com sucesso!");
		}
		System.out.println("Verifique seu saldo!");
	
	}
	
	
	public double getLimite() {
		return limite;

	}

	public double getSaldoDisponivel() {
		this.saldoDisponivel = super.saldo + this.limite;
		return this.saldoDisponivel;
	}

		

}
