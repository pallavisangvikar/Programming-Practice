package sept.github.assignments;

public class Print1To10 {
	/*b. Write a program to print 1 to 10 numbers without using loops 
	 * and you should not have more than 1 print statement.
	 * 
	 */
	
	static int i = 0;
	static {
	    try {
	        recurse();
	    } catch (Throwable t) {
	        System.exit(0);
	    }
	}

	private static void recurse() {
	    System.out.print(++i + 0 / (i - 11) + " ");
	    recurse();
	}
	
	public static void print(int i){
		
		if (i<11)
			System.out.print(++i + " ");
		print(i);
	}
	
	public static void main(String[] args){
		
		//Print1To10.recurse();
		Print1To10.print(0); 
	}
	
}

