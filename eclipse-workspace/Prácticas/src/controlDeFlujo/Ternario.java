package controlDeFlujo;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int age = s.nextInt();
				
		System.out.println(age >= 18 && age <= 150 ? "Eres mayor de edad" : age >0 && age < 18 ? "Eres menor de edad" : "Valor fuera de rango");
	}

}



//Sitaxis de operador ternario: variable = (condition) ? expressionTrue :  expressionFalse;