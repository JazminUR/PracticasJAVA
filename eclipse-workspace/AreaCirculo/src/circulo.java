import java.util.Scanner; 


public class circulo {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);

		System.out.println ("Ingresa el diametro");
		double diametro= s.nextInt();
		double radio = diametro/2;

		double area= (3.1416 * radio * radio);
		int myArea = (int)area; 
		
		System.out.println(area);
		System.out.println(myArea);
		System.out.println ("El area del circulo es: " + area);
		
		
		double perimetro = ((2 * 3.1416) * radio); // con decimal
		int myPerimetro = (int)perimetro; // enteros
		
		System.out.println(perimetro);
		System.out.println(myPerimetro);
		
		System.out.println("El perimetro del circulo es: " + perimetro);
	}

}