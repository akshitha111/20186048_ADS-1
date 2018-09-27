import java.util.*;
class BalancedParanthesis {
	BalancedParanthesis() {

	}
}

public class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		String[] bracket = new String[input];
		for (int i = 0; i < input; i++) {
			bracket[i] = sc.nextLine();
		}
		BalancedParanthesis bp = new BalancedParanthesis();
		/*for (int j = 0; j < input; j++) {
			System.out.println(bp.balanced(bracket[j]));
		}*/
		System.out.println(Arrays.toString(bracket));

	}
}