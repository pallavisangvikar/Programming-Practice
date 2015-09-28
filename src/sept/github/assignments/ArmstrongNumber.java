package sept.github.assignments;

import java.util.Scanner;

public class ArmstrongNumber {
	/*f. Write a program  to check an armstrong number 
	 * i.e. whether the if we power up the each individual number 
	 * to the total number of digits in the number and add them 
	 * it should be equal to the number itself. 
	 * For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
	 *  FYI: ^ means is to the power.
	 */    
	public static int power(int n, int p){
		int s = 1;
		for(int i=1; i<=p; i++){
			s = s * n;
		}
		return(s);
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int sum = 0, temp, n, p = 0;
		
		System.out.println("Enter the number:");
	    int num = scan.nextInt();
	    
	    temp = num;
	    while(temp!=0){
	    	p++;
	    	temp = temp/10;
	    }
	    temp = num;
	    while(temp!=0)
	    {
	    	n = temp%10;
	    	sum += power(n,p);
	    	temp = temp/10;
	    }
	    
	    if(num == sum)
	    	System.out.println(num+ " is an Armstrong Number.");
	    else
	    	System.out.println(num+ " is not an Armstrong Number.");
	}

}
