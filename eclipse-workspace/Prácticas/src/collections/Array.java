package collections;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		//String[] arreglo = {"Mau", "Sofi", "Sam", "Abril"};
		
		//System.out.println(arreglo[1]);
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		
		System.out.println(cars);
		
		//Acceder a un artículo
		cars.get(1);
		System.out.println(cars);
		
		//Cambiar un artículo
		cars.set(0, "Mercedes");
		System.out.println(cars);
		
		//Eliminar un articulo
		cars.remove(0);
		System.out.println(cars);
		
		//Tamaño de ArrayList
		System.out.println(cars.size());

	}

}
