
public class Romboide implements FiguraGeometrica {
	
	private float base;
	private float altura;
	private String nombre;
	
	public Romboide(float base, float altura, String nombre) {
		super();
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	} //constructor

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public float area() {
		return (base * altura);
	} //area
	
	@Override
	public float perimetro() {
		return (base * 2) + (altura *2);
	} //perimetro
		

}
