package aulas;

import java.util.Scanner;

public class TesteEntradaDeDados {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Informe o nome: ");
		String nome = scan.nextLine();
		System.out .println("Nome informado: " + nome);
		
		System.out.println("Informe a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Idade informada: " + idade);
				
		System.out.println("Informe sua data de nascimento: ");
		scan.nextLine();
		String dataNascimento = scan.nextLine();
		System.out.println("Data de nascimento informada: " + dataNascimento);
		
		scan.close();
	}
	
	


	

	
	

}
