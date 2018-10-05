import java.util.Scanner;
class Pair {
	public String pairStar(String str) {
		if (str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		}
		return str.charAt(0) + pairStar(str.substring(1));
		}
	}

class Solution {
	private Solution() {

	} public static void main(String[] args) {
		Pair p = new Pair();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		p.pairStar(str);
		System.out.println(p.pairStar(str));

	}
}