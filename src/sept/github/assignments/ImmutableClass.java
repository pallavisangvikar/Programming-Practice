package sept.github.assignments;

public final class ImmutableClass {
	/*a. Write an Immutable class.
	 * 
	 */
	
	private final String name;
    private final String mobile;

    public ImmutableClass(String name, String mobile) {
        this.name = name; 
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }


}
