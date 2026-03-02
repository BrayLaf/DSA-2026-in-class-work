package stackTesting;

public class StackTest {

	public static void main(String[] args) {
		
		Istack<Integer> stk = new StackArray<Integer>();
		
		stk.push(1);
		stk.push(3);
		stk.push(7);
		stk.push(2);
		System.out.println(stk.peek());
		System.out.println(stk.empty());
		stk.display();
		
		Istack<String> stk2 = new StackArray<String>();
		
		stk2.push("Hello,");
		stk2.push(" World");
		stk2.push("Backwards");
		
		stk2.display();

	}

}
