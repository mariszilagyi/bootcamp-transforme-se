package playground.loops_e_arrays.exercicioslista1;

public class Exercicio1 {
	
	public static void main(String[] args) {
		double salario = 1000.00;
		double aumento = 0.015;
		
		
		for(int i = 1996; i <= 2022; i++) {
			salario *= (aumento + 1);
			aumento *= 2;
			System.out.println(i + " : " + salario + " - Taxa: " + aumento);
		}
		
		System.out.println("Salário atual: " + salario);
		
	}
}
