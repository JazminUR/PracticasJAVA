
public class testCalculos {

		public static void main(String[] args) {
			Triangulo t1 = new Triangulo("triángulo", 10, 20, 10, 10, 10);
			Triangulo t2 = new Triangulo("triángulo", 15, 25, 15, 15, 15);
			Cuadrado c1 = new Cuadrado("cuadrado 1", 25);
			Rectangulo r1 = new Rectangulo("rectángulo 1",25, 15);
			Romboide rom1 = new Romboide(20, 10, "romboide 1");
			Rombo rombo1 = new Rombo(8, 12, 5, "rombo 1");
			Trapecio trapecio1 = new Trapecio(5, 8, 8, 10, 5, 10, 14, "trapecio 1");
			
			//Triangulos
			Calculos.calc(t1);
			Calculos.calc(t2);
			
			//Cuadrado
			Calculos.calc(c1);
			
			//Rectangulo
			Calculos.calc(r1);
			
			//Romboide
			Calculos.calc(rom1);
			
			//Rombo
			Calculos.calc(rombo1);

	}//main
} // class testCalculos
