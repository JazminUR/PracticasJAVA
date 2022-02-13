
public class Rombo implements FiguraGeometrica {
	
	private float lineaSuperior;
	private float lineaInferior;
	private float lado;
	private String nombre;
	
	public Rombo(float lineaSuperior, float lineaInferior, float lado, String nombre) {
		super();
		this.lineaSuperior = lineaSuperior;
		this.lineaInferior = lineaInferior;
		this.lado = lado;
		this.nombre = nombre;
	} //constructor

	public float getLineaSuperior() {
		return lineaSuperior;
	}

	public void setLineaSuperior(float lineaSuperior) {
		this.lineaSuperior = lineaSuperior;
	}

	public float getLineaInferior() {
		return lineaInferior;
	}

	public void setLineaInferior(float lineaInferior) {
		this.lineaInferior = lineaInferior;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public float area() {
		return (lineaSuperior * lineaInferior) /2;	
	}//area

	@Override
	public float perimetro() {
		return (lado * 4);
	}//perimetro


}
