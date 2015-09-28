package sept.github.assignments;

public class ShapeTest {

	public static void main(String[] args) {
		//Circle circle = new Circle();
		double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.calculateArea()
            + "\nResulting Perimeter: " + circle.calculatePerimeter() + "\n");

		// TODO Auto-generated method stub

	}

}
