package sept.github.assignments;

public class SortAnArray {

	public static void main(String[] args) {
		
		int a[] = {2,4,1,5,3};
		
		/*   // Using Bubble sort method (The bubble sort knows that it is finished when it examines the entire 
		//array and no "swaps" are needed (thus the list is in proper order). )
	    	 boolean flag = true; 
	    	 while ( flag == true ){
	    		 flag = false; 
			for(int i=0; i<a.length-1; i++){
				
					if(a[i]>a[i+1]){
					
						int temp = a[i+1];
						a[i+1] = a[i];
						a[i] = temp;
						flag = true; 
					
					}
				
				}
			}
			
		System.out.print("The Sorted array is : { " );
		for(int temp:a){
				System.out.print(temp+" ");
				}
		System.out.print("}");
		*/
			
		/*	//Using Exchange Sort method ( The exchange sort compares the first element 
			//with each following element of the array, making any necessary swaps. )
			
			for(int i=0; i<a.length-1; i++){
				for(int j=i+1; j<a.length; j++){
					if(a[i]>a[j]){
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.print("The Sorted array is : { " );
			for(int temp:a){
				System.out.print(temp+" ");
				}
			System.out.print("}");
			*/
			
		/*	//Using Selection Sort method (The selection sort is a combination of searching and sorting. During each 
			//pass, the unsorted element with the smallest (or largest) value is moved to its 
			//proper position in the array. ) 
			 
		     for (int i = a.length - 1; i > 0; i-- ) 
		     {
		          int first = 0;   
		          for(int j = 1; j <= i; j ++)   
		          {
		               if( a[ j ] > a[ first ] )         
		                 first = j;
		          }
		          int temp = a[ first ];   
		          a[ first ] = a[ i ];
		          a[ i ] = temp; 
		      }
		     System.out.print("The Sorted array is : { " );
				for(int temp:a){
				System.out.print(temp+" ");
				}
				System.out.print("}");
			*/
			
			//Using Insertion Sort method (The insertion sort splits an array into two sub-arrays. 
			//The first sub-array (like the cards in your hand)is always sorted and increases in size as the sort continues.
			//The second sub-array (like the cards to be picked up) is unsorted, contains all the elements 
			//yet to be inserted into the first sub-array, and decreases in size as the sort continues. )
			  for (int j = 1; j < a.length; j++)    
			    {
			       
			       int key = a[j];
		            int i = j-1;
		            while ( (i > -1) && ( a [i] > key ) ) {
		                a [i+1] = a [i];
		                i--;
		            }
		            a[i+1] = key;
		
			     }
			  System.out.print("The Sorted array is : { " );
				for(int temp:a){
				System.out.print(temp+" ");
				}
				System.out.print("}");
			
		

	}

}
