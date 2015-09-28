package sept.github.assignments;

import java.util.Scanner;

public class AcceptAndPrint {
	/*g. Write a program  that accepts input from the command line and then prints them.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter Your Name:");
		String name = scan.nextLine();
		
		System.out.println("Enter the number:");
	    int num = scan.nextInt();
	    
	    System.out.println("Hello " +name+"!");
	    System.out.println("You entered the number "+num+".");

	}

}
