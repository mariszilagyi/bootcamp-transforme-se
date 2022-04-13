package playground.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConceitosList {

	public static void main(String[] args) {

		List<Integer> boraTreinar = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5));

		System.out.println(boraTreinar.toString());
		System.out.println(boraTreinar.indexOf(2));
		boraTreinar.add(9);
		boraTreinar.set(boraTreinar.indexOf(2), 4);
		System.out.println(boraTreinar.contains(8));
		System.out.println(boraTreinar.get(3));
		System.out.println(Collections.min(boraTreinar));
		System.out.println(Collections.max(boraTreinar));
		System.out.println(boraTreinar.toString());

		Iterator<Integer> iterator = boraTreinar.iterator();
		
		Integer soma = 0;
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			soma += next;
		}
		
		System.out.println(soma);
		
		
		List<Livro> meusLivros = new ArrayList<>(){{
			add(new Livro("Teste1", "Teste2"));
			add(new Livro("Teste3", "Teste4"));
			add(new Livro("Teste5", "Teste6"));
		}};
		
		System.out.println(meusLivros);
		
		
		
		
		



	}

}

class Livro{
	
	private String nome;
	private String autor;
		
	public Livro(String nome, String autor) {
		super();
		this.nome = nome;
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + "]";
	}	
	
	
}
