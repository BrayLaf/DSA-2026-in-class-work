package quadraticForm;
import java.util.Scanner;

public class QuadraticForm {
	public static String calcQuad(double a, double b, double c) {
		double result = (b*b) - 4 * a * c;
		
		if(result == 0) 
			return "One real root";
		else if(result < 0)
			return "Two imaginary root";
		else
			return "Two real roots";
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		System.out.println(calcQuad(a, b, c));
	}

}
