package playground.collection.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteExercicio4 {
	
	
	public static void main(String[] args) {
		
		Peca peca1 =  new Vestuario();
		peca1.setMarca("Vestuário-Marca1");
		peca1.setModelo("Vestuário-Modelo1");
		
		Peca peca2 =  new Sapato();
		peca2.setMarca("Sapato-Marca1");
		peca2.setModelo("Sapato-Modelo1");
		
		GuardaVolumes guardaVolumes = new GuardaVolumes();
		List<Peca> listaPeca1 = new ArrayList();
		listaPeca1.add(peca1);
		List<Peca> listaPeca2 = new ArrayList();
		listaPeca2.add(peca2);
		
		for (Peca peca : listaPeca2) {
			System.out.println(peca.getMarca());
			System.out.println(peca.getModelo());
			
		}
		
		for (Peca peca : listaPeca1) {
			System.out.println(peca.getMarca());
			System.out.println(peca.getModelo());
			
		}
			
		guardaVolumes.guardarPecas(listaPeca1);
		guardaVolumes.guardarPecas(listaPeca2);
		
		System.out.println("\nGUARDA VOLUMES DEPOIS DE INCLUIR 2 ITENS: ");
		guardaVolumes.mostrarPecas();
		
		System.out.println("\nIMPRIMINDO APENAS O ITEM 1 DO GUARDA VOLUMES:  ");
		guardaVolumes.mostrarPecas(1);
		
		
		guardaVolumes.devolverPecas(1);
		
		System.out.println("\nGUARDA VOLUMES DEPOIS DE DEVOLVER ITEM 1: ");
		guardaVolumes.mostrarPecas();

		
		
	}

	

}
