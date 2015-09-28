package sept.github.assignments;

public abstract class Shape {
	/*a. Write a program creating an abstract class Shape with 
	 * properties (noOfSides,area,perimeter) and 
	 * methods(calculateArea,calculatePerimeter,setSides.
	 */
	
	int noOfSides;
	double area;
	double perimeter;
	public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double setSides();
    

}
