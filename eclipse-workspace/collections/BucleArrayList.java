package collections;

import java.util.ArrayList;
import java.util.Collections;

public class BucleArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		
		for (int i = 0; i<cars.size(); i++) {
			
			System.out.println(cars.get(i));
		}
		
		//Con forEach
		for (String i:cars) {
			
			System.out.println(i);
			
		}
		
		//Para ordenar
		Collections.sort(cars); 
		
			for(String i:cars) {
			
				System.out.println(i);
			}

	}

}
