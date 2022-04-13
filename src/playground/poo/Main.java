package playground.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Jogador ciclano = new Jogador();
		Arma arma1 = new Arma("Pistola", 1, 20, 8);
		Arma arma2 = new Arma("Espingarda", 2, 60, 2);
		
		List<Arma> armas = new ArrayList<Arma>();
		armas.add(arma2);
		armas.add(arma1);
		
		
		ciclano.setArmas(armas);
		
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.atirar();
		arma1.recarregar();
		arma1.atirar();
		
		

		arma2.atirar();
		arma2.atirar();
		arma2.recarregar();
		arma2.atirar();
		
		
		
		
		ciclano.getArmas().toString();
		
		
	}
}
