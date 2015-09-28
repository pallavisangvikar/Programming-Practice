package sept.github.assignments;

public class NullPointerExcep {
	
	public static void readStrings(String read){
		
		String str = read;
		//String str = null;
		
		try {
			System.out.println("Try Block executed");
			if(str.toString() != null){
				System.out.println("String is : "+str);
			}
		} catch (NullPointerException np) {
			System.out.println("Catch Block executed");
			System.out.println(np.initCause(null)); 
			//e.printStackTrace();
		} finally {
			System.out.println("Finally Block executed.");
		}
			
		
			
	}

	public static void main(String[] args) {
		NullPointerExcep.readStrings("Welcome");
		NullPointerExcep.readStrings(null);

	}

}
