package sept.github.assignments;

public class ArrayPrograms {
	
	/*a. Write a program to find the largest number in a given array.
	 * 
	 */
	public void largestNumber()
	{
		int[] a = {12, 100, 5 ,1, 2, 7, 13, 20, 1, 4};
		int large = a[0];
		for(int i =1; i<a.length; i++){
			if(large<a[i])
				large = a[i];
			
		}
		System.out.println("The largest number in the array is : "+large);
				
	}
	
	
	/*b. Write a program to find the missing number 
	 * in a series of sorted numbers stored in an array.
	 * 
	 */
	public void missingNumber(){
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10};
		int len = a[a.length-1];
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum += a[i];
		}
		int num = ((len*(len+1))/2)-sum;
		System.out.println("Missing number is : " +num);
		
	}
	
	/*c. Write a program to find the common number in any given two arrays.
	 * 
	 */
	public void commonNumber(){
		int a[] = {2, 3, 4, 10, 5, 6};
		int b[] = {6, 7, 9, 2, 3, 5};
		int[] c = new int[a.length];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length;j++){
				if(a[i] == b[j]){
					c[i] = a[i];
				}
			}
		}
		System.out.print("Given array a[] = [ ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		System.out.print("Given array b[] = [ ");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println("]");

		System.out.println("The common numbers in the given array are :");
		for(int temp:c){
			if(temp!=0)
			System.out.print(" "+temp);
		}
	}
	
	
	/*d. Write a program to perform a linear search on any given array.
	 * Linear search is the basic search where you look for the element 
	 * to be searched in a sequential way.
	 * 
	 */
	public void linearSearch(){
		int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 34;
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] == searchKey){
            	System.out.println("Key "+searchKey+" found at index: "+i); 
            }
        }
	}
	
	
	/*f. Write a program to locate and swap only 2 elements which are not sorted 
	 * in a given sorted array. For example given an array {1,2,5,6,4} locate 5 and 4 
	 * and then swap them as they are not as per sorted order.
	 * 
	 */
	public void swapElements(){
		int[] arr = {1,2,5,6,4};
		int ele1 = 5;
		int ele2 = 4;
		int j = 0, k = 0;
		
		System.out.print("Array before swap of 2 elements:");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]==ele1){
				j = i;
			}
			else if(arr[i]==ele2){
				k = i;
			}
		}
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
		
		System.out.print("\nArray after swap of 2 elements:");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	/*g. Write a program to merge 2 arrays.
	 * 
	 */
	public void mergeArrays(){
		int[] arr1 = {2,3, 5,7,1};
		int[] arr2 = {5,3,1,7,9,10};
		int[] arrMerge = new int[arr1.length + arr2.length];
		int j = 0;
		System.out.print("First Array: ");
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		
		System.out.print("\nSecond Array: ");
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
		
		System.out.print("\nMerged Array: ");
		for(int i=0; i<arrMerge.length; i++){
			if(i<arr1.length){
				arrMerge[i] = arr1[i];
			}
			else{
				arrMerge[i] = arr2[j];
				j++;
			}
			System.out.print(arrMerge[i]+" ");
		}
	}
}
