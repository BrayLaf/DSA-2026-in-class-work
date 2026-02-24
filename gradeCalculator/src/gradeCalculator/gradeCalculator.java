package gradeCalculator;
import java.util.Scanner;


public class gradeCalculator {
	
	public static String letterGrade(int mark) {
		
		if(mark >= 95) {
			return "A+";
		}else if(mark >= 85) {
			return "A";
		}else if(mark >= 75) {
			return "B+";
		}if(mark >= 65) {
			return "B";
		}else if(mark >= 55) {
			return "C+";
		}else if(mark >= 45) {
			return "C";
		}if(mark >= 35) {
			return "D+";
		}else if(mark >= 25) {
			return "D";
		}else {
			return "F";
		}
	}

	public static void main(String[] args) {
		
		int marks;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks out of 100: ");
		marks = input.nextInt();
		System.out.println(letterGrade(marks));
		
	}

}
