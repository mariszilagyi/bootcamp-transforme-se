package aulas.msbank;

import java.time.LocalDate;
import java.util.Scanner;

public class Gerente extends Funcionario implements AcessoInterno{
	
	//mockado
	private String usuario = "usuariopadrao";
	private String senha = "123";

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, String ctps, LocalDate dataAdmissao, double salario) {
		super(nome, cpf, ctps, dataAdmissao, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return getSalario()*0.1;
		
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha)){
			return true;
		}
		
		return false;
	}

	@Override
	public boolean alterarSenha(String usuario, String senha, String novaSenha) {
		
		if(autenticarSistema(usuario, senha)) {
			
			if(novaSenha.length() <= 8) {
				this.senha= novaSenha;
				System.out.println("Senha alterada com sucesso");
				return true;
			} else {
				System.out.println("Senha deve ter até 8 caracteres");
				return false;
			}

		} 
			
		System.out.println("Usuário ou senha inválido");
		return false;
		
	}

	@Override
	public boolean alterarUsuario(String usuario, String senha, String novoUsuario) {
		if(autenticarSistema(usuario, senha)) {
			
			if(novoUsuario.length() <= 12) {
				this.usuario = novoUsuario;
				System.out.println("Usuário alterado com sucesso");
			} else System.out.println("Usuário deve ter até 12 caracteres");
			
		} 

		System.out.println("Usuário ou senha inválido");
		return false;
	}

}
