package sept.github.assignments;

public class Circle extends Shape implements ShapeConstants {

	
	private final double radius;
	
	public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi * Math.pow(radius, 2);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		 return 2 * pi * radius;
	}

	@Override
	public double setSides() {
		// TODO Auto-generated method stub
		return radius;
	}

}
