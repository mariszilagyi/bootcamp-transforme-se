package aulas.aula7.msbank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		/*
		 * Pessoa pessoa1 = new Pessoa(); pessoa1.setNome("José das Couves");
		 * pessoa1.setProfissao("Agricultor"); pessoa1.setCpf("508.767.732-00");
		 * 
		 * Pessoa pessoa2 = new Pessoa("João Batata", "508.767.732-00", "123.456");
		 * 
		 * System.out.println("Nome: " + pessoa1.getNome());
		 * System.out.println("Profissão: " + pessoa1.getProfissao());
		 * System.out.println("CPF: " + pessoa1.getCpf() + "\n");
		 * 
		 * System.out.println("Nome: " + pessoa2.getNome()); System.out.println("CPF: "
		 * + pessoa2.getCpf()); System.out.println("RG: " + pessoa2.getRg());
		 */
		
		Conta conta1 = new Conta();
		
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular("Mariana Szilagyi");
		conta1.depositar(230000);
		
		Conta conta2 = new Conta();
		
		conta2.setAgencia(2345);
		conta2.setNumeroConta(8990);
		conta2.setTitular("Flavia Almeida");


		
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular());
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());

		conta1.sacar(20);
		
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());
		
		conta1.transferir(14000, conta2);
		
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta2.getSaldo());
		
		
		
		
		
	}

}
