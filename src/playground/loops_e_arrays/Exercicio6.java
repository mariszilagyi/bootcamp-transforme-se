package playground.loops_e_arrays;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de termos: ");
		int quantidadeDeTermos = scan.nextInt();
		System.out.println("Digite o valor de X: ");
		double X = scan.nextDouble();
		double potencia = X;
		int fatorial = 1;
		double S = 0;
		int controleS = 0;
		int controleQtdTermos = 0;
		int controleFatorial = 1;
		
		while(quantidadeDeTermos > controleQtdTermos) {
						
			for(int i = 1; i <= 4; i++) {
				potencia *= X;
				fatorial *= controleFatorial;
				controleQtdTermos++;
				controleFatorial++;
				controleS++;
				
				if(controleS == 1) {
					S -= (potencia / fatorial);
				}
				if(controleS == 2) {
					S += (potencia / fatorial);
					controleS = 0;
				}
				 if(quantidadeDeTermos == controleQtdTermos) {
					 controleFatorial = 0;
					 break; 
				 } 
			}
			
			for(int i = 3; i > 1; i--) {
				
				if(controleFatorial == 0) break;
				potencia *= X;
				controleFatorial--;
				
				fatorial /= controleFatorial;
				controleQtdTermos++;
				controleS++;
				if(controleS == 1) {
					S -= (potencia / fatorial);
				}
				if(controleS == 2) {
					S += (potencia / fatorial);
					controleS = 0;
				}
				 if(controleFatorial == 3) {
					 fatorial = 1;
					 controleFatorial = 1;
				 }
				 if(quantidadeDeTermos == controleQtdTermos) break;
			}

		}
		System.out.println("Potência: " + potencia);
		System.out.println("Total = " + S);
	}
}
