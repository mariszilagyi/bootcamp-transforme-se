package playground.loops_e_arrays.exercicioslista2;

import java.util.Scanner;

public class Exercicio2 {
	
//	Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha
//	igual o nome de usu�rio, mostrando uma mensagem de erro voltando para pedir
//	informa��es.
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usuario = "igual";
		String senha = "igual";
		
		while(usuario.equals(senha)) {
			System.out.println("Digite seu usu�rio:");
			usuario = scan.next();
			System.out.println("Digite sua senha:");
			senha = scan.next();
			if(usuario.equals(senha)) System.out.println("Usu�rio e senha n�o podem ser iguais, digite novamente as informa��es: ");
			else System.out.println("Usu�rio e senha cadastrados");			
		}
		
		
	}


}
