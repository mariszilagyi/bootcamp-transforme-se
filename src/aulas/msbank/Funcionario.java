package aulas.msbank;

import java.time.LocalDate;

public class Funcionario {
	
	//Crie uma nova Classe chamada Funcionário com os seguintes atributos: nome, cpf. ctps, dataAdmissao, salario

	
	
	
	private final double INDICE = 0.05;
	
	private String nome;
	private String cpf;
	private String ctps;
	private LocalDate dataAdmissao;
	private double salario;
	
	
	public Funcionario() {
		super();	
	}
	
	
	public Funcionario(String nome, String cpf, String ctps, LocalDate dataAdmissao, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public double getBonus() {
		return this.salario * INDICE; 
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
	
		return "Nome: " + getNome() + 
				"\nCTPS: " + getCtps() +
				"\nData de Admissão: " + getDataAdmissao() +
				"\nSalário: " + getSalario();
		
	}
	
	
	
	
}
