package playground.streamapi.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioStreamAPI {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Maria", "100.000.000-00");
		Cliente cliente2 = new Cliente("João", "120.000.000-00");
		Cliente cliente3 = new Cliente("José", "123.000.000-00");
		Cliente cliente4 = new Cliente("Junior", "123.400.000-00");
		Cliente cliente5 = new Cliente("Luan", "123.450.000-00");
		Cliente cliente6 = new Cliente("Luana", "123.456.000-00");
		Cliente cliente7 = new Cliente("Talita", "123.456.700-00");
		Cliente cliente8 = new Cliente("Fabiana", "123.456.780-00");

		Produto produto1 = new Produto("Produto 1", "Marca Produto 1");
		Produto produto2 = new Produto("Produto 2", "Marca Produto 2");
		Produto produto3 = new Produto("Produto 3", "Marca Produto 3");
		Produto produto4 = new Produto("Produto 4", "Marca Produto 4");
		Produto produto5 = new Produto("Produto 5", "Marca Produto 5");
		Produto produto6 = new Produto("Produto 6", "Marca Produto 6");
		Produto produto7 = new Produto("Produto 7", "Marca Produto 7");
		Produto produto8 = new Produto("Produto 8", "Marca Produto 8");
		
		List<Produto> produtos = new ArrayList<Produto>(Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8));
		System.out.println(produtos.toString());
		
		Compras compra1 = new Compras(cliente1, produto1, 200.00);
		Compras compra2 = new Compras(cliente2, produto2, 400.00);
		Compras compra3 = new Compras(cliente3, produto3, 600.00);
		Compras compra4 = new Compras(cliente4, produto4, 800.00);
		Compras compra5 = new Compras(cliente5, produto5, 1000.00);
		Compras compra6 = new Compras(cliente6, produto6, 1200.00);
		Compras compra7 = new Compras(cliente7, produto7, 1400.00);
		Compras compra8 = new Compras(cliente8, produto8, 1600.00);

//		System.out.println(compra1.toString());
//		System.out.println(compra2.toString());
//		System.out.println(compra3.toString());
//		System.out.println(compra4.toString());
//		System.out.println(compra5.toString());
//		System.out.println(compra6.toString());
//		System.out.println(compra7.toString());
//		System.out.println(compra8.toString());

		List<Compras> compras = new ArrayList<>(Arrays.asList(compra1, compra2, compra3, compra4, compra5, compra6, compra7, compra8));
		
		System.out.println(compras);
		Stream<Compras> streamCompras = compras.stream();
		Stream<Produto> streamProdutos = produtos.stream();
		streamProdutos.forEach(s -> System.out.print(s.getNomeProduto() + " | "));
	}

}
