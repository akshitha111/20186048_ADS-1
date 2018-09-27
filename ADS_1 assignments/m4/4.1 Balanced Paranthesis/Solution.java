import java.util.*;
class BalancedParanthesis {
	BalancedParanthesis() {

	}
	public void isBalanced(String[] array) {
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int freqOne = 0;
		int freqTwo = 0;
		int freqThree = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == "(") {
				countOne += 1;
			}
			if(array[i] == "{") {
				countTwo += 1;
			}
			if(array[i] == "(") {
				countThree += 1;
			}
			if(array[i] == "}") {
				freqOne += 1;
			}
			if(array[i] == "]") {
				freqTwo += 1;
			}
			if(array[i] == ")") {
				freqThree += 1;
			}
		}
		
		if(countOne == freqOne && countTwo == freqTwo && countThree == freqThree) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}




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
		//System.out.println(Arrays.toString(bracket));
		bp.isBalanced(bracket);

	}
}