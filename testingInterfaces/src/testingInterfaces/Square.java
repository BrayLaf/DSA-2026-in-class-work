package testingInterfaces;

public class Square implements IShape {
	private double side = 10;

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void drawShape() {
		System.out.println("draw square on screen ");
	}

}
