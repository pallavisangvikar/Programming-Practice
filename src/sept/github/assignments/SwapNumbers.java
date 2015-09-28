package sept.github.assignments;

import java.util.Scanner;

public class SwapNumbers {
	/*c. Write a program that swaps 2 given numbers. 
	 * You need to have 2 separate functions in the program.
	 * --> One Function should swap the numbers without any third new variable.
	 * --> Second function should swap the numbers using a third variable.
	 */
	
	public static void withOutNewVariable(int num1, int num2){
		
		System.out.println("Swap Numbers without any third variable.");  
		//Method-I
		/*	num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 = "+num1+" num2 = "+num2);
		
		//Method-II
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		System.out.println("num1 = "+num1+" num2 = "+num2);
		*/
		//Method-III
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("num1 = "+num1+" num2 = "+num2);
	
	}
	
	public static void withNewVariable(int num1, int num2){
		
		System.out.println("Swap Numbers using third variable.");
	    int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = "+num1+" num2 = "+num2);
	}


	public static void main(String[] args) {
		//int num1=10, num2=20;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two numbers for swapping: ");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    
	    System.out.println("Entered numbers are:");
	    System.out.println("num1 = "+num1+" num2 = "+num2);
	    
	    System.out.println("Swapped numbers are:");
	    
	    SwapNumbers.withOutNewVariable(num1, num2);
	    SwapNumbers.withNewVariable(num1, num2);
	    	    
	   
	}

}
