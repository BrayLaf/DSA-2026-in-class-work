import java.util.ArrayList;
import java.util.HashSet;

public class InterviewQuestions {

	public int findPriceyNeighbours(double[] prices)
	{
		// n is the number of house prices
		// O(n) / linear time complexity
		int len = prices.length;
		
		if(len < 3) {
			return 0;
		}
		
		double greatestSum = prices[0] + prices[1] + prices[2];
		int indexOfSum = 0;

		for(int i = 1; i < len - 2; i++) {
			
			double sum = prices[i] + prices[i + 1] + prices[i + 2];

			if(sum > greatestSum) {
				greatestSum = sum;
				indexOfSum = i;
			}
		}
		
		return indexOfSum;
	}
	public ArrayList<String> commonFriends(ArrayList<String> friendListOne, ArrayList<String> friendListTwo)
	{
		ArrayList<String> common=new ArrayList<String>();
		
		// n is the length of the largest array
		// O(n + m) where n is friendListOne and m is friendListTwo / linear
		
		HashSet<String> hash = new HashSet<>();
		
		
		for(int i = 0; i < friendListOne.size(); i++) {
			hash.add(friendListOne.get(i));
		}
		
		for(int j = 0; j < friendListTwo.size(); j++) {
			String friend = friendListTwo.get(j);
			if(hash.contains(friend))
				common.add(friend);
		}
		
		return common;
	}
	public int countDivisors(int[] values){
		// n is the number of values
		// O(n^2) / quadratic
		int len = values.length;
		int count = 0;
		
		for(int i = 0; i < len - 1; i++) {
			for(int j = i + 1; j < len; j++) {
				if(values[j] != 0 && values[i] % values[j] == 0) {
					count++;
				}
			}
		}

		return count;
	}
	public int findIndexOfFirstOddNumber(int[] numbers) {
	    // n is the number of elements in the array
	    // O(log n) time complexity 

	    int left = 0;
	    int right = numbers.length - 1;
	    int result = -1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (numbers[mid] % 2 != 0) {
	            result = mid;
	            right = mid - 1;
	        } else {
	            left = mid + 1;
	        }
	    }

	    return result;
	}
}
