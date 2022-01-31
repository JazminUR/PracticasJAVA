package actGithub;

import java.util.Scanner;

public class movieDiscounts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		int edad = s.nextInt();
		
		
		if (edad >= 0 && edad < 5) {
			
			System.out.println("Tienes descuento de 60%, el costo será: " + (7 * .4));
		}
		
		else if (edad > 60) {
			
			System.out.println("Tienes descuento de 55% el costo será: " + (7 * .45));
		}
		
		else if (edad >= 5 && edad <= 60) {
			
			System.out.println("No tienes descuento");
			System.out.println("Dime la cantidad de boletos que deseas");
			int boletos = s.nextInt();
			
				if(boletos >= 2) {
					
					System.out.println("Tienes descuento del 20% el costo será: " + boletos * (7 * .70));
				}
				
				else if (boletos == 1) {
					
					System.out.println("No tienes descuento");
				}
				
				else {
					
					System.out.println("Número de boletos inválido");
				}
		}
		
		else  {
			
			System.out.println("Edad inválida");
			
		}
	}

}
