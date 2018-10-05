
import java.util.Scanner;
class Factorial {
	public int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} if(n > 1) {
			return n * factorial(n - 1);
		} return 0;
	}
}

class Solution {
	private Solution() {

	}public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f.factorial(n);
		System.out.println(f.factorial(n));
	}
}