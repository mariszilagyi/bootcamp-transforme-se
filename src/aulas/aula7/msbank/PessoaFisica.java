package aulas.aula7.msbank;

public class PessoaFisica extends Pessoa{ 
	
	private String cpf;
	private String rg;
	private String profissao;
	
	
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String cpf, String rg, String profissao) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
	
	
	

}
