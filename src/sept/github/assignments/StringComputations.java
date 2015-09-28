package sept.github.assignments;

import java.util.Scanner;

public class StringComputations {
	
	/*a. Write a program to reverse a string.
	 * Donot use StringBuffer/StringBuilder inbuilt reverse function.
	 */
	public void reverseString(){
		  String oStr, rStr = "";
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("Enter a string to reverse :");
	      oStr = in.nextLine();
	 
	      for ( int i = oStr.length() - 1 ; i >= 0 ; i-- )
	         rStr = rStr + oStr.charAt(i);
	 
	      System.out.println("Reverse of entered string is : \n"+rStr);
	}
	
	
	/*b. Write a program to find a substring in a given string 
	 * and then replace it with another string.
	 */
	public void replaceString(){
		  String oStr, newStr = "", str1 = "", str2 = "";
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("Enter a String : ");
	      oStr = in.nextLine();
	      
	      System.out.println("Enter a sub String for search: ");
	      str1 = in.nextLine();
	      
	      System.out.println("Enter sub String for replacing the searched sub String : ");
	      str2 = in.nextLine();
	      
	      newStr = oStr.replace(str1, str2) ;
	      
	      System.out.println("New String is : \n"+newStr);
	}
	
	
	/*c. Write a program which accepts a string like "This is nice" and 
	 * converts it to a string like "This1 is2 nice3".
	 */
	public void convertString(){
		String oStr = "This is nice";
		String cStr = "";
		String[] original = oStr.split(" ");
		
		System.out.println("The input string is : \n"+oStr);
		
		System.out.println("The output string is : ");
		for(int i=0; i<original.length; i++){
			System.out.print(original[i]+(i+1)+" "); 
		}
	}
	
	
	/*d. Write a program to reverse each individual word in a sentence.
	 * 
	 */
	public void reverseWord(){
		  String oStr, rStr = "";
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("Enter a string to reverse :");
	      oStr = in.nextLine();
	      
	      String[] original = oStr.split(" ");
	      
	      System.out.println("The reversed string is : \n");
			for(int i=original.length-1; i>=0; i--){
				System.out.print(original[i]+" "); 
			}   
	}
	
	
	/*e. Write a program to check for a palindrome string.
	 * 
	 */
	public void palindrome(){
		  String oStr, rStr = "";
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("Enter a string to reverse :");
	      oStr = in.nextLine();
		  
	      int length = oStr.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	    	  rStr = rStr + oStr.charAt(i);
	 
	      if (oStr.equals(rStr))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 
	}
	
	
	/*f. Write a program to check if a given string of parenthesis 
	 *has balanced parenthesis or not.For example a string as "(())" 
	 *is a valid string where as strings like ")(" or "(()))" are not valid strings.
	 *
	 */
	public void balanced(){
		
		String input = "(((()))()))(";
		
		int open = 0, close = 0;
		int problem1 = 0;
		
		for(int i=0;i<input.length();i++){
			
			if(input.charAt(i)=='(')
				open++;
			else if(input.charAt(i)==')')
				close++;
			
			if(close>open)
				problem1++;

		}
			
		if (open != close || problem1 > 0){
			System.out.println("String is not balanced.");
		}else {
			System.out.println("String is balanced.");
		}

	}
	
}
