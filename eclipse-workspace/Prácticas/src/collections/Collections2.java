package collections;

import java.util.HashMap;

public class Collections2 {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("Engald", "London");
		capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
		
		for (String i : capitalCities.keySet()) { System.out.println(i); }
		for (String i : capitalCities.values()) { System.out.println(i); }
		for (String i : capitalCities.keySet()) {  System.out.println("key: " + i + " value: " + capitalCities.get(i));}

		
		//Acceder a un artículo
		capitalCities.get("England");
		System.out.println(capitalCities);
		
		//Eliminar un artículo
		capitalCities.remove("England");
		
		//Para eliminar todos los elementos
		capitalCities.clear();
		System.out.println(capitalCities);
		
		//Tamaño de HashMap
		capitalCities.size();
		System.out.println(capitalCities);
		
		//Recorrer un HashMap
		
	}

}
