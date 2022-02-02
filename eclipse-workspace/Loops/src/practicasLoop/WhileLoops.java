package practicasLoop;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
        
        System.out.print("Enter any positive integer: ");
        num = s.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        int i = 1;
        
        while (i <= 10) {
        	
        	System.out.println(num + " x " + i + " = " + num * i);
        	i++;
        }
		

	}

}
