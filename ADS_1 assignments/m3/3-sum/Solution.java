import java.util.*;
class ThreeSum {
	public void threeSum(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length-2; i++) {
			if(arr[i] + arr[i+1] + arr[i+2] == 0) {
				count++;
			}
		}
		//System.out.println(count);
	}

}

class Solution {

	private Solution() {

	}
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}System.out.println(arr);
		ts.threeSum(arr);
	}
}