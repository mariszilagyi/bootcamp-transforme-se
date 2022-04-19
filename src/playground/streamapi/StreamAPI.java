package playground.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		Stream<String> teste1Stream = Stream.of("1", "teste", "10.50");
		
		
		
		String[] teste2 = {"teste1", "teste2", "Teste3"};
		Stream<String> teste2Stream = Stream.of(teste2);
			
		List<Integer> teste3 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5));
		Stream<Integer> teste3Stream = teste3.stream();
		
		

		teste1Stream.forEach(System.out::println);
		teste2Stream.forEach(System.out::println);
		teste3Stream.forEach(System.out::println);
		
		System.out.println(teste3.toString());
		System.out.println(teste3.indexOf(2));
		teste3.set(teste3.indexOf(2), 4);
		System.out.println(teste3.toString());
		

	}
}
