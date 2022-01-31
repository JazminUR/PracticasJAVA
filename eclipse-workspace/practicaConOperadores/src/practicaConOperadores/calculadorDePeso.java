package practicaConOperadores;

import java.util.Scanner;

public class calculadorDePeso {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		
		System.out.println("Tell me your weight in kilos");
		double weight = w.nextDouble();
		System.out.println("Tell me your height in m");
		double height = w.nextDouble();
		
		double BMI = (weight/(height * height));
		
		if(BMI < 20) {
			
			System.out.println("Your BMI is " + BMI + ", you're underwight");
		}
		
		else if(BMI < 25 && BMI >= 20) {
			
			System.out.println("Your BMI is " + BMI + ", you're doing great");
		}
		
		else if(BMI < 30 && BMI >= 25) {
			
			System.out.println("Your BMI is " + BMI + ", you're overweight");
		}
		
		else if(BMI >= 30) {
			
			System.out.println("Your BMI is " + BMI + ", you're obese");
		}
	}
}
