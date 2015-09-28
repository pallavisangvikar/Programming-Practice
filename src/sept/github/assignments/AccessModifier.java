package sept.github.assignments;

public class AccessModifier {
	
	/*d. Write a program that implements various functions of different type of 
	 * access modifiers(private,protected,default,public) and then access these 
	 * methods with in or outside the class based on the identifier scope.
	 * 
	 * 
	 * 
	 * Created another package as sept.github.assignment.test
	 * Checked for all the following conditions 
	 * AM--Access Modifier, WC--Within Class, WP--Within Package
	 * OPBSC--Outside Package By SubClass, OP--Outside Package
AM			WC		WP 		OPBSC		OP
Private		Y		N		N			N
Default		Y		Y		N			N
Protected	Y		Y		Y			N
Public		Y		Y		Y			Y

	 */
	
	 private static void privModifier(){
		 
		 System.out.println("Private Modifier method is executed.");
		 
		 
	 } 
	 
	 protected static void protModifier(){
		 
		 System.out.println("Protected Modifier method is executed.");
		 
	 }
	 
	 static void defModifier(){
		 
		 System.out.println("Default Method is executed.");
		 
	 }
	 
	 public static void pubModifier(){
		 
		 System.out.println("Public Method is executed.");
	 }

	public static void main(String[] args) {
		
		AccessModifier.protModifier();
		AccessModifier.privModifier();
		AccessModifier.defModifier();
		AccessModifier.pubModifier();
		

	}

}
