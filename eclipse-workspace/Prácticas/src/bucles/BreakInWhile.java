package bucles;

public class BreakInWhile {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 10) {
			
			System.out.println(i);
			
			i++;
			
			if (1 == 4) {
				break;
			}
		}

	}

}
