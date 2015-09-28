package sept.github.assignments;

import java.util.Scanner;

public class PingPong {
	/*b. Write a program print "ping" if a number is divisible by 3,
	 * "pong" if a number is divisible by 5, 
	 * and "ping pong" if number is divisible by both, else print the number.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
	    int num = scan.nextInt();
		
		
			if(num%3 == 0 && num%5 == 0)
				System.out.println("ping pong");
			else if(num%3 == 0)
				System.out.println("ping");
			else if(num%5 == 0)
				System.out.println("pong");
			else
				System.out.println(num);
								
		}

	}


