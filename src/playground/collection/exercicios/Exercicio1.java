package playground.collection.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercicio1 {

	/*
	 * A- Criar um dicion�rio que represente os primeiros 5 n�meros da �Loteria dos
	 * Sonhos�, junto com seu significado. Para isso, o dicion�rio dever� ter como
	 * chave Integer e como valor uma String. N�meros da Loteria dos Sonhos: 0 =
	 * Ovos 1 = �gua 2 = Escopeta 3 = Cavalo 4 = Dentista 5 = Fogo
	 */

	public static void main(String[] args) {

		Map<Integer, String> dicionarioDosSonhos = new HashMap<>();
		dicionarioDosSonhos.put(0, "Ovos");
		dicionarioDosSonhos.put(1, "�gua");
		dicionarioDosSonhos.put(2, "Escopeta");
		dicionarioDosSonhos.put(3, "Cavalo");
		dicionarioDosSonhos.put(4, "Dentista");
		dicionarioDosSonhos.put(5, "Fogo");

		System.out.println("IMPRESS�O DO DICION�RIO DOS SONHOS: ");
		for (Entry<Integer, String> dicionario : dicionarioDosSonhos.entrySet()) {

			System.out.println(dicionario.getKey() + " -> " + dicionario.getValue());
		}

		/*
		 * Criar um dicion�rio que represente os apelidos que uso para chamar os meus
		 * amigos. Para isso, o dicion�rio dever� ter como chave String e como valor uma
		 * lista de Strings.
		 * 
		 * Jo�o = Juan, Fissura, Maromba Miguel = Night Watch, Bruce Wayne, Tampinha
		 * Maria = Wonder Woman, Mary, Marilene Lucas = Lukinha, Jorge, George
		 */

		List<String> apelidosJoao = new ArrayList<>(Arrays.asList("Juan", "Fissura", "Maromba"));
		List<String> apelidosMiguel = new ArrayList<>(Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha"));
		List<String> apelidosMaria = new ArrayList<>(Arrays.asList("Wonder Woman", "Mary", "Marilene"));
		List<String> apelidosLucas = new ArrayList<>(Arrays.asList("Lukinha", "Jorge", "George"));

		Map<String, List<String>> apelidosAmigos = new HashMap<>();

		apelidosAmigos.put("Jo�o", apelidosJoao);
		apelidosAmigos.put("Miguel", apelidosMiguel);
		apelidosAmigos.put("Maria", apelidosMaria);
		apelidosAmigos.put("Lucas", apelidosLucas);

		System.out.println("\nIMPRESS�O DO DICION�RIO DOS APELIDOS DOS AMIGOS: ");
		for (Entry<String, List<String>> apelidos : apelidosAmigos.entrySet()) {

			System.out.println(apelidos);

		}

	}
}
