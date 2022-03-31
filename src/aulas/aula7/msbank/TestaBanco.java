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
		
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Mariana Szilagyi Santos");
		pf1.setCpf("879.359.983-88");
		pf1.setEmail("mari.szilagyi@gmail.com");
		pf1.setProfissao("Desenvolvedora de Software");
		pf1.setRg("999555 SSP/RO");
		pf1.setTelefone("99 99999-9999");
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setNome("João da Silva");
		pf2.setCpf("879.359.983-88");
		pf2.setEmail("joaosilva@gmail.com");
		pf2.setProfissao("Agricultor");
		pf2.setRg("888555 SSP/RO");
		pf2.setTelefone("88 88888-8888");
		
		Conta conta1 = new Conta();
		
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular(pf1);
		conta1.depositar(230000);
		
		Conta conta2 = new Conta();
		
		conta2.setAgencia(2345);
		conta2.setNumeroConta(8990);
		conta2.setTitular(pf2);

		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular().getNome());
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());

		conta1.sacar(20);
		
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());
		
		conta1.transferir(14000, conta2);
		
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta2.getSaldo());
		
		ContaCorrente cc1 = new ContaCorrente();
		
		cc1.depositar(1000);
		
		System.out.println("Saldo sem limite: " + cc1.getSaldo());
		System.out.println("Limite: " + cc1.getLimite());
		System.out.println("Saldo disponível: " + cc1.getSaldoDisponivel());
		
		System.out.println("________________________________________________");
		cc1.sacar(1500);

		System.out.println("Saldo sem limite: " + cc1.getSaldo());
		System.out.println("Limite: " + cc1.getLimite());
		System.out.println("Saldo disponível: " + cc1.getSaldoDisponivel());
		
		
		
		
		
		System.out.println();
		
		
		
		
	}

}
