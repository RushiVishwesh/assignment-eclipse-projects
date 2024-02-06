package solarcalculator;
import java.util.Scanner;

public class calculator {
	static int c;
		
	public static int add(int a, int b) {
	    c = a + b;
	    return c;
	}
    public static int subtract(int a, int b) {
	    c = a - b;    
    	return c;
	}
    public static int multiply(int a, int b) {
	    c = a * b;    
    	return c;
	}
	public static int divide(int a, int b) {
	    if (b == 0) {
	         throw new IllegalArgumentException("Cannot divide by zero");
	    }
	    c = a / b;
	    return c; 
	}
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Sum of the numbers: " + calculator.add(a, b));
        System.out.println("Difference of the numbers: " + calculator.subtract(a, b));
        System.out.println("Product of the numbers: " + calculator.multiply(a, b));
        System.out.println("Division of the numbers: " + calculator.divide(a, b));
        sc.close();          
	}
}