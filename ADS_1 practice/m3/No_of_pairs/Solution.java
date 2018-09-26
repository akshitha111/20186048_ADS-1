import java.util.*;

class Solution {

	private Solution(){

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int s = sc.nextInt();
		int c = 1;
		int[] arr = new int[s];
		System.out.println("Enter the elements of the array");
		for (int i= 0; i<s; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		System.out.println("The Sorted array is " + Arrays.toString(arr));
		for (int i = 0; i< s-1; i++) {
			if (i == s -2 && arr[i] == arr[i+1]) {
				c++;
				sum += c * (c -1) /2;
				c = 1;
				break;
			} if (arr[i] == arr[i+1]) {
				c++;
				continue;
			} if (c>1 && arr[i] != arr[i+1]) {
				sum += c * (c-1)/2;
				c =1;
				
			}
		}
		System.out.println("Number of pairs: " + sum);
	}

}