package aulas.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMaps {

	public static void main(String[] args) {

		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();

		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Japão", 58);
		quadroMedalhasOlimpicas2020.put("Grã-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);

		System.out.println(quadroMedalhasOlimpicas2020.containsKey("EUA"));
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("Alemanha"));

		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(59));	
		
		System.out.println(quadroMedalhasOlimpicas2020.size());
		
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {

			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		
		System.out.println("=========================================");
		for(String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key + " => " + quadroMedalhasOlimpicas2020.get(key));
		}
		
		
		TreeMap<String, Integer> quadroMedalhasOlimpicas2016 = new TreeMap<>();
		
		quadroMedalhasOlimpicas2016.put("EUA", 113);
		quadroMedalhasOlimpicas2016.put("China", 88);
		quadroMedalhasOlimpicas2016.put("Japão", 58);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 65);
		quadroMedalhasOlimpicas2016.put("Brasil", 21);
		
		System.out.println(quadroMedalhasOlimpicas2016.firstKey());
		System.out.println(quadroMedalhasOlimpicas2016.lastKey());
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China"));
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China"));
		
		
		


	}

}
