package sept.github.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListOps {
	
	/*a. Write a program having different methods to perform below operations.
	 *--> To create an arraylist and add elements to it.
	 *--> To search for an element in the list.
	 *--> To print the elements of the list using iterator.
	 *--> To print the elements in the reverse order using ListIterator.
	 *
	 */
	
	public void addArrayList(){
		List myArrLt = new ArrayList();
		myArrLt.add(12);
		myArrLt.add(12.5);
		myArrLt.add("Apple");
		myArrLt.add("Banana");
		myArrLt.add("David");
	
		System.out.println(myArrLt);
	}
	
	
	public void searchElement(String s){
		int j=0;
		List<String> myArrFruits = new ArrayList();
		myArrFruits.add("Pinapple");
		myArrFruits.add("Orange");
		myArrFruits.add("Apple");
		myArrFruits.add("Banana");
		myArrFruits.add("Strawberry");
		
		for(String str:myArrFruits){
			if(str == s)
				 j ++;
			
		}
		if(j == 1)
			System.out.println(s+" is found.");
		else
			System.out.println(s+" is not found.");
	
		}
	
	public void iterator(){
		List<String> myArrFruits = new ArrayList();
		myArrFruits.add("Pinapple");
		myArrFruits.add("Orange");
		myArrFruits.add("Apple");
		myArrFruits.add("Banana");
		myArrFruits.add("Strawberry");
		System.out.println("Printing elements using Iterator : ");
		Iterator it = myArrFruits.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void reverse(){
		List<String> myArrFruits = new ArrayList();
		myArrFruits.add("Pinapple");
		myArrFruits.add("Orange");
		myArrFruits.add("Apple");
		myArrFruits.add("Banana");
		myArrFruits.add("Strawberry");
		
		ListIterator lt = myArrFruits.listIterator(myArrFruits.size());
				
		System.out.println("\n\nPrinting elements in reverse order using ListIterator : ");		
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
	}
	
	/*g. Write a program to copy arraylist to an array.
	 * 
	 */
	public void copyToArray(){
		List<String> myArr = new ArrayList<>();
		myArr.add("12");
		myArr.add("Peter");
		myArr.add("12.9");
		myArr.add("David");
		myArr.add("Peter");
		myArr.add("Steven");
		
		int len = myArr.size();
		String[] arr = new String[len];
		for(int i=0; i<len; i++){
			arr[i] = myArr.get(i);
			System.out.print(arr[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		ArrayListOps alo = new ArrayListOps();
		//alo.addArrayList();
		//alo.searchElement("Apple");
		//alo.iterator();
		//alo.reverse();
		alo.copyToArray();

	}

}
