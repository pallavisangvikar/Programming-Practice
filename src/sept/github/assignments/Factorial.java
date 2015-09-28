package sept.github.assignments;

import java.util.Scanner;

public class Factorial {
	/*d. Write a program  to calculate factorial of a given number. 
	 * You need to compute the factorial with one logic that uses recursion and 
	 * another logic without recursion.
	 * n!=prod_{k= 1 to n} k. eg. 5! = 5 * 4 * 3 * 2 * 1 = 120.
	 */
	
	public static long factorialRecursion(int n, long fact){
		//long fact = 1;
		if(n==0){
			return(1);			
		}
		else{
			fact = n * factorialRecursion(n-1, fact);
			return (fact);		
		}
	}
	
	public static long factorialWithOutRecursion(int n, long fact){
		//long fact = 1;
	    for(int i =1; i<=n; i++){
	    	fact = fact * i;
	    }
		return(fact);
	}
	
	public static void main(String[] args) {
		 
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter the for finding factorial: ");
			    int num = scan.nextInt();
			    
			    long fact = 1;
			    
			    fact = Factorial.factorialRecursion(num, fact);
			    System.out.println("The factorial of " +num+ "("+num+"!) with Recursion is: "+fact);
			    fact = 1;
			    fact = Factorial.factorialWithOutRecursion(num, fact);
			    System.out.println("The factorial of " +num+ "("+num+"!) without Recursion is: "+fact);
			    	

	}


}
