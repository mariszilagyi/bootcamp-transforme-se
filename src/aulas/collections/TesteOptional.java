package aulas.collections;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class TesteOptional {

	public static void main(String[] args) {

		Optional<String> listaString = Optional.of("Valor optional presente");
		listaString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

		Optional<String> listaNula = Optional.ofNullable(null);
		listaNula.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

		Optional<String> listaVazia = Optional.empty();
		listaVazia.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

//		Optional<String> listaComErro = Optional.of(null);
//		listaComErro.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

		OptionalInt.of(23).ifPresent(System.out::println);

		OptionalDouble.of(22.55).ifPresent(System.out::println);

		OptionalLong.of(23L).ifPresent(System.out::println);

	}
}
