package playground.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Jogador ciclano = new Jogador();
		Arma arma1 = new Arma("Pistola", 1, 20);
		Arma arma2 = new Arma("Espingarda", 2, 60);
		
		List<Arma> armas = new ArrayList<Arma>();
		armas.add(arma2);
		armas.add(arma1);
		
		
		ciclano.setArmas(armas);
		
		ciclano.getArmas().toString();
		
		
	}
}
