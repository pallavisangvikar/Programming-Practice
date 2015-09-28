package sept.github.assignments;

public class StaticDemo {
	
	/*e. Write a program that contains a constructor, a static block 
	 * and a static method. Execute the program in order to verify 
	 * the order to execution of methods and block.
	 * 
	 * 
	 * 
	 * Static block will execute first then static constructor and 
	 * the static method.
	 * 
	 */
	
	public static void staticMethod() {
        System.out.println("This is Static Method");
    }


	public StaticDemo() {
		System.out.println("This is Static Constructor.");
	}
	
	static{
		System.out.println("This is Static Block");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd = new StaticDemo();
		sd.staticMethod();

	}

}
