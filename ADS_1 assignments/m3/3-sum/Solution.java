import java.util.*;
class ThreeSum {

	public void threeSum(int[] arr) {
		int count = 0;
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-2; j++) {
			if(arr[i] + arr[j] + arr[j+2] == 0) {
				count += 1;
			}
		}
		}
		System.out.println(count);
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
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ts.threeSum(arr);
	}
}