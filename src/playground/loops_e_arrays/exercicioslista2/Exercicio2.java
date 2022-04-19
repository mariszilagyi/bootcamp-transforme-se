package playground.loops_e_arrays.exercicioslista2;

import java.util.Scanner;

public class Exercicio2 {
	
//	Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
//	igual o nome de usuário, mostrando uma mensagem de erro voltando para pedir
//	informações.
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usuario = "igual";
		String senha = "igual";
		
		while(usuario.equals(senha)) {
			System.out.println("Digite seu usuário:");
			usuario = scan.next();
			System.out.println("Digite sua senha:");
			senha = scan.next();
			if(usuario.equals(senha)) System.out.println("Usuário e senha não podem ser iguais, digite novamente as informações: ");
			else System.out.println("Usuário e senha cadastrados");			
		}
		
		
	}


}
