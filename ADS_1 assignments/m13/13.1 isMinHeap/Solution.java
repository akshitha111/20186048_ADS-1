import java.util.*;
class MinHeap<E extends Comparable<E>>  {
	private E[] arr;
	public MinHeap(E[] str) {
		this.arr = str;
	}
	public boolean isMinHeap() {
		for(int i = 0; i < arr.length; i++) {
			if (!less(arr[i], arr[i + 1])) {
				return false;
			}
		}return true;
	}
		public boolean less(E i, E j) {
		boolean a =  i.compareTo(j) <= 0;
		return a;
		}
	}

public class Solution {
	private Solution() {

	} public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		switch (st) {
		case "String":		
		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
			MinHeap<String> mh = new MinHeap<String>(line);
				System.out.println(mh.isMinHeap());
		}break;
		case "Integer":
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
			System.out.println(line);
		}break;
		case "Double":
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
		}break;
		case "Float":
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
		}break;
	}
	}
}