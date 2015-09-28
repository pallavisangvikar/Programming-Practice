package sept.github.assignments;

import java.util.Scanner;

public class Prime {
	/*e. Write a program  to check if a given number is prime or not.
	 */
	
	public static boolean isPrime(int num){
		if(num>1){
			for(int i=2; i<=num/2; i++){
	            if(num % i == 0){
	                return false;
	            }
	        }
	        return true;
		}
		else
			return false;
		 

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the for checking prime or not: ");
	    int num = scan.nextInt();
	    
	    Prime p = new Prime();
	    
	    System.out.println("Is number "+num+" Prime: "+ p.isPrime(num));
	   
	}

}
