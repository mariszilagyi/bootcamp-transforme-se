package playground.collection.exercicios.exercicio3;

import java.util.Set;

public class Prova {

	/*
	 * Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
	 * public void somaTotal(Set<Integer> conjuntoDeInteiros)
	 * 
	 * O método deve percorrer o conjunto de inteiros, ir acumulando o total da soma
	 * dos valores e, no final, imprimir na tela o valor da soma total. Em seguida
	 * crie uma classe Exercício 3 com seu método main, imprimir no Main todas as
	 * chaves junto com seus valores associados. Para isso, utilizar o foreach com
	 * as chaves.
	 */

	private int soma = 0;

	public void somaTotal(Set<Integer> conjuntoDeInteiros) {
		for (Integer numero : conjuntoDeInteiros) {
			soma += numero;
		}
		System.out.println("Conjunto: " + conjuntoDeInteiros);
		System.out.println("Soma do Conjunto: " + soma);
	}

}
