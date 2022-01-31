import java.util.Scanner;

public class UserProfile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre?");
		String name = s.nextLine();
		System.out.println("Dime tu edad");
		int age = i.nextInt();
		System.out.println("Dime tu genero");
		String gender = s.nextLine();
		System.out.println("Dime tu preferencia de trabajo");
		String jobPref = s.nextLine();
		System.out.println("Dime tu nacionalidad");
		String nat = s.nextLine();
		System.out.println("Dime tu tipo de sangre");
		String blood = s.nextLine();
		int birthYear = 2022 - age - 1;
		
		
		System.out.println("Hola, " + name + " tienes " + age + " años, eres del genero " + gender);
		System.out.println("Tu preferencia laboral es: " + jobPref + ". Tu nacionalidad es: " + nat + " y tu tipo de sangre es: " + blood);
		
		System.out.println("Tu año de nacimiento es: " + birthYear);
	}
}
