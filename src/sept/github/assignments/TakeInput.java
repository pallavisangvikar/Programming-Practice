package sept.github.assignments;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
	
	/*a. Write a program that takes input from user dynamically using below classes.
	 *--> Scanner: Use this class to input 2 integer numbers and sum them.
	 *--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
	 *--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
	 *--> Console: Use this class to input 2 integer numbers and divide them.
	 *
	 */
	
	public void inputScanner(){
		 Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Enter your rollno");  
		   int rollno=sc.nextInt();  
		   System.out.println("Enter your name");  
		   String name=sc.next();  
		   System.out.println("Enter your fee");  
		   double fee=sc.nextDouble();  
		   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
		   sc.close();  
	}
	
	public void inputBrIsr(){
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		  
		System.out.println("Enter your name");  
		String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
		System.out.println("Welcome "+name); 
	}
	
	public void inputDis(){
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter your rollno");  
		int rollno = 0;
		try {
			rollno = dis.readInt();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		   System.out.println("Rollno:"+rollno);  
	}
	
	public void inputConsole(){
		Console c = System.console();  
		String n = null;
		System.out.println("Enter your name: ");  
		
		c.readLine();  
		System.out.println("Welcome "+n); 
	}

	public static void main(String[] args) {
		TakeInput ti = new TakeInput();
		//ti.inputScanner();
		//ti.inputBrIsr();
		//ti.inputDis();
		ti.inputConsole();

	}

}
