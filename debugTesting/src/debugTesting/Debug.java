package debugTesting;

public class Debug {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i < 14; i++) {
			sum += sum + i;
		}
	}

}
