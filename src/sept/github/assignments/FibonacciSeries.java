package sept.github.assignments;

import java.util.Scanner;

public class FibonacciSeries {
	/*a. Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.
	 * You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 
	 * or any desired number.(F_n = F_{n-1} + F_{n-2} with F_1=1, F_2=1) 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length of Fabonacci Series: ");
	    int num = scan.nextInt();
	    
		int[] f = new int[num];
		float avg = 0;
		float sum = 0;
		System.out.print("The first " +num+ " Fibonacci numbers are : ");
		for(int i=0; i<f.length; i++){
			if(i == 0 || i == 1){
				f[i] = 1;
			}
			else
			f[i] = f[i-1] + f[i-2];
			
			System.out.print(f[i]+" ");
			sum = sum + f[i];
		}
	}

}
