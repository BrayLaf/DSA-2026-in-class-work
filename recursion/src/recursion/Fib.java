package recursion;

public class Fib {
	
	// Euclidean Algorithm
	public static int mystery(int a, int b) {
		if(a % b ==0)
			return b;
		else 
			return mystery(b, a % b);
	}
	//Write a recursive code that calculates sum of first n numbers
	// if I enter 5 it should return 15
	public static int sum(int a) {
		if(a == 0)
			return 0;
		else if(a == 1)
			return 1;
		return a + sum(a - 1);
	}
	//College
	public static void mystery(String str) {
		if(str == null || str.equals(""))
			return ;
		else 
			mystery(str.substring(1));
		System.out.println(str.charAt(0));
	}
	
	public static int fib(int n) {
		if(n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		
		//System.out.println(mystery(24, 9));
		//mystery("College");
		System.out.println(sum(5));
	}
}
