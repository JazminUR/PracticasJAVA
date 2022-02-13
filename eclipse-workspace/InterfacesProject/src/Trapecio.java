
public class Trapecio implements FiguraGeometrica {
	private float lado1;
	private float lado2;
	private float lado3;
	private float lado4;
	private float baseMayor;
	private float baseMenor;
	private float altura;
	private String nombre;
	
	public Trapecio(float lado1, float lado2, float lado3, float lado4, float baseMayor, float baseMenor, float altura,
			String nombre) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.nombre = nombre;
	}
	

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}

	public float getLado4() {
		return lado4;
	}

	public void setLado4(float lado4) {
		this.lado4 = lado4;
	}

	public float getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(float baseMayor) {
		this.baseMayor = baseMayor;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public float area() {	 
		return (altura * (baseMayor + baseMenor) /2);
	}//area
	
	@Override
	public float perimetro() {
		return lado1 +lado2 + lado3 + lado4;
	}//perimetro

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
