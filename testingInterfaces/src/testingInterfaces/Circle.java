package testingInterfaces;

public class Circle implements IShape {
	
	private double radius = 5; 

	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void drawShape() {
		System.out.println("draw circle on screen ");
	}

}
