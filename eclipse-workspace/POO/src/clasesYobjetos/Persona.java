package clasesYobjetos;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Jazmín", "Urzúa", 22);
		System.out.println("El nombre de la persona es: " + persona1.getNombre());
		System.out.println("El apellido de la persona es: " + persona1.getApellido());
		System.out.println("La edad de la persona es: " + persona1.getEdad());
		
		Persona persona2 = new Persona("", "", 0);
		persona2.setNombre("Larissa");
		persona2.setApellido("De La Vega");
		persona2.setEdad(25);
		
		System.out.println("El nombre de la persona es: " + persona2.getNombre());
		System.out.println("El apellido de la persona es: " + persona2.getApellido());
		System.out.println("La edad de la persona es: " + persona2.getEdad());
		
	}

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
