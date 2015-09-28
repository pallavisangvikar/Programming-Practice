package sept.github.assignments;

import java.util.Scanner;

public class HandleException {
	/*b. Write a program containing a function which is expected to throw 
	 * any kind of exception say NullPointerException or ArithmeticException 
	 * etc and then handle this function in 
	 * the parent function which calls this function.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a and b Strings for division:");
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		String ret;
		try {
			
			ret = ExceptionDemo.doDivision(a, b);
			System.out.println(ret);
		} catch (NullPointerException npe) {
			System.out.println(npe.initCause(null));
			System.out.println("Please enter numbers.");

		} catch (ArithmeticException ae){
			System.out.println(ae.initCause(null));
			System.out.println("Please enter non zero value for b.");
			
		}catch (NumberFormatException nfe){
			System.out.println(nfe.initCause(null));
			System.out.println("Please enter numbers.");

			
		}catch(Exception e){
			System.out.println("Contact System Admin.");
		}
		
		
		

	}

}
