package funciones;

public class Main {
	
	static void datos(String nombre, String apellido, int edad) {
		
		System.out.println("Mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años");
	}

	public static void main(String[] args) {
		
		datos("Jazmín", "Urzúa", 22);
		datos("Briana", "Lopez", 26);
		datos("Alonso", "Grajeda", 26);
	}

}
