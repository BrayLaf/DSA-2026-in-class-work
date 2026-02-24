package testingInterfaces;

public class Rectangle implements IShape {
	private double side;
	private double side2;

	@Override
	public double getArea() {
		return side * side2;
	}

	@Override
	public double getPerimeter() {
		return (side + side2) * 2;
	}

	@Override
	public void drawShape() {
		System.out.println("draw rectangle on screen ");
	}

}
