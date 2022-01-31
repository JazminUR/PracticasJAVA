package practicaConOperadores;

import java.util.Scanner;

public class practica {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce tu usuario: ");
		String user = s.nextLine();
		
		System.out.println("Introduce tu password: ");
		String pass = s.nextLine();
		
		String _user = "Jazmin";
		String _pass = "12345";
		
		System.out.println(user == _user);
		System.out.println(user.equals(_user));
		
		System.out.println(pass == _pass);
		System.out.println(pass.equals(_pass));
		
		int var1 = pass.compareTo(_pass);
		
		if(var1 == 0 && user.equals(_user)) {
			System.out.println("Bienvenido");
		}
		
		else if(var1 == 0) {
			
			System.out.println("Verifica tu usuario");
		}
		
		else if (user.equals(_user) && var1 != 0) {
			
			System.out.println("Verifica tu contraseña");
		}
		
		else {
			
			System.out.println("Verifica tu usuario y contraseña");
		}
	}
}
