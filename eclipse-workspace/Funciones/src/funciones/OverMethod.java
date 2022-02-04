package funciones;

public class OverMethod {
	
	static int myMethod(int age) {
		return age;
	}
	
	static float myMethod(float height) {
		return height;
	}
	
	static double myMethod(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		System.out.println("Mi edad es: " + myMethod(22));
		System.out.println("Mi edad es: " + myMethod(1.63f));
		System.out.println("La suma de dos números aleatorios: " + myMethod(1.5, 3.8));

	}

}

//Esto se conoce como sobre carga de metodo.
