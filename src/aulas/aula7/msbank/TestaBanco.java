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
		conta1.setSaldo(1000000.50);
		conta1.setTitular("Mariana Szilagyi");
		
		
		
		
	}

}
