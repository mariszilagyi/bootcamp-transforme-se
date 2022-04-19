package playground.collection.exercicios.exercicio3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TesteExercicio3 {
	
	public static void main(String[] args) {
		
		Set<Integer> conjunto1 = new HashSet<>(Arrays.asList(1,3,5,8,9,10));
		
		Prova testeConjunto1 = new Prova();
		testeConjunto1.somaTotal(conjunto1);
	}

}
