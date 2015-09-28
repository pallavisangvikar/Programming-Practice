package sept.github.assignments;

public class EnumMonths {
	/*f. Write a program that defines an enum having months of the year 
	 * and then prints the value of all the enum elements.
	 */
	
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		
		int count = 1;
	    // loop through our enum
	    for (Month m: Month.values())
	    {
	      System.out.printf(" %d. %s\n", count++, m);
	    }

	}

}
