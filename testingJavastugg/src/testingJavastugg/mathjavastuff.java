package testingJavastugg;

public class mathjavastuff {
	public static double CalcRectangle(double length, double width) {
		return length * width;
	}
	public static double CalcAreaTriangle(double base, double height) {
		return .5 * (base * height);
	}
	public static double CalcTriangleHero(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	public static void main(String[] args) {
		
		System.out.println("Tri Area is: " + CalcAreaTriangle(12.00, 20.00));
		System.out.println("Rect Area is: " + CalcRectangle(10.00, 20.00));
		System.out.println("Herons formula: " + CalcTriangleHero(3.0, 4.0, 5.0));
	}

}
