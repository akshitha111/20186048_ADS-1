import java.util.*;
class ThreeSum {
	private int count = 0;
	
	public void threeSum(int[] arr) {
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i] + arr[i+1] + arr[i+2] == 0) {
				count++;
		}
		
			}System.out.println(count);
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