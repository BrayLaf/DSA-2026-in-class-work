
public class ShapeDriver {

	public static void main(String[] args) {
		square square = new square();
		rectangle rec = new rectangle();
		isOdd oddEven = new isOdd();
		
		
		System.out.println("perimeter of Square: " + square.getPerimeter());
		System.out.println("area of Square: " + square.getArea());
		System.out.println("Area of rectangle: " + rec.getArea());
		
		System.out.println("this is even: " + oddEven.oddEven(2));
		System.out.println("this is even: " + oddEven.oddEven(3));
	}

}
