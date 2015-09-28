package sept.github.assignments;

public class ExceptionDemo {
	
	public static String doDivision(String a, String b){
		
		String div = null;
		a = a.toString();
		b = b.toString();
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		int Div;
		Div = A / B;
		
		div = String.valueOf(Div);
		return div;
		
	}

}
