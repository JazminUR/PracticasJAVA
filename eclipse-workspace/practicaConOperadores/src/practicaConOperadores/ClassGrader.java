package practicaConOperadores;

import java.util.Scanner;

public class ClassGrader {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingresa la calificación del estudiante: ");
		double grade = s.nextDouble();
		
		
		if(grade >= 0 && grade <= 10) {
		
		if(grade <= 3) {
			
			System.out.println("Failed");
		}
		
		else if(grade > 3 && grade <= 5) {
			
			System.out.println("Insufficient");
		}
		
		else if(grade > 5 && grade <= 8) {
	
			System.out.println("Good");
		}
		
		else if(grade == 10) {
			
			System.out.println("Excellent");
		}
	}
		
		else {
			
			System.out.println("Value out of range");
		}
	}
}


