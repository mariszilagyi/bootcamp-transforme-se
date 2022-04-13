package aulas.debug;

public class TesteDebug {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.soma(5,4);
		System.out.println(calc.subtracao(5, 4));;
		
		Calculadora.multiplicacao(5, 4);
	}
	
	

}
