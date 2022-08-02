import java.util.Scanner;

public class Calculator {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
	    //Ask user to enter a first number		
	    System.out.println("Enter a first number");
		double num1=sc.nextDouble();
		//Ask user to enter a second number
		System.out.println("Enter a second number");
		double num2=sc.nextDouble();
		//Ask user to choose arithmetic operation
		System.out.println("Choose the operations: + - * / ");
		char m=sc.next().charAt(0);
	operation(num1,num2,m);

	
}
   public static double operation(double num1,double num2,char m) {
			double out = 0;
	        // addition
	        if (m == '+') {
	            out = num1 + num2;
	        }
	     // subtraction
	        else if (m == '-') {
	            out = num1 - num2;
	        }
	     // multiplication
	        else if (m == '*') {
	            out = num1 * num2;
	        }
	      // Division
	        else if (m == '/') {
	            out = num1 / num2;
	        }
	        float result=(float)out; //type casting
	        System.out.println("Your answer is " + result);
	        return result;
		}

	}
		
