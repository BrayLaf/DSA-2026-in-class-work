package testingArrayLists;
import java.util.ArrayList;

public class DemoArrayList {
	
	public static void multiList(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> sol = new ArrayList<Integer>();
		
		for(int i = 0; i < a.size(); i++) {
			sol.add(a.get(i) * b.get(i));

			System.out.println(sol.get(i));
		}
	}


	public static void main(String[] args) {
		ArrayList<Integer> myNums = new ArrayList<Integer>(2);
		
		myNums.add(1);
		myNums.add(2);
		myNums.add(3);
		
		ArrayList<Integer> myNums2 = new ArrayList<Integer>(2);
		
		myNums2.add(1);
		myNums2.add(2);
		myNums2.add(3);
		
		multiList(myNums, myNums2);
	} 

}
