package sept.github.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collections {
	
	/*b. Write a program to find duplicates in an array using set.
	 * 
	 */
	public void duplicate(){
		
		//String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		String[] names = { "abd", "abc", "abd", "adc", "abc", "acd" };
		
		System.out.print("\nOriginal Array is: ");
		for(int i=0; i<names.length; i++){
			System.out.print(names[i]+" ");
		}
		
		System.out.print("\n\nDuplicate elements are: ");
		Set<String> store = new HashSet<>(); 
		for (String name : names) {
			if (store.add(name) == false) { 
				System.out.println(name); 
				} 
		}
				
		
	}
	
	
	/*c. Write a program which takes an input series as 
	 * a1,a2,a3....an,b1,b2,b3...bn and produces output as 
	 * a1,b1,a2,b2,a3,b3.......,an,bn.
	 */
	public void outputOfSeries(){
		Scanner sc = new Scanner(System.in);
		
		List<String> myArr = new ArrayList();
		//System.out.println("Please enter the series of elements: ");
		
		/*String[] series = {"a1", "a2", "a3", "a4","a5","b1", "b2", "b3", "b4", "b5"};
		for(String store:series){
			myArr.add(store);
		}*/
		System.out.println("Enter the length of array : ");
		int len = sc.nextInt();
		System.out.println("Enter the elements for the input series: ");
		for(int i=0; i<len; i++){
			String s = sc.next();
			myArr.add(s);
		}
		System.out.println("Output series is: ");
		
		for(int i=0; i<(len/2); i++){
			int j = (len/2)+ i ;
			if(j<myArr.size())
			System.out.print(myArr.get(i)+" "+myArr.get(j)+" ");
			
		}
		
	}
	
	
	

}
