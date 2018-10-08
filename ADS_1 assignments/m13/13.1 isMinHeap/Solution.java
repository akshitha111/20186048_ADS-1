import java.util.*;
class MinHeap<E extends Comparable<E>>  {
	private E[] arr;
	public MinHeap(E[] str) {
		this.arr = str;
	}
	public boolean isMinHeap() {
		for(int i = 0; i < arr.length - 1; i++) {
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
		while(n > 0) {
			String[] line = sc.nextLine().split(" ");
			MinHeap<String> mh = new MinHeap<String>(line);
				System.out.println(mh.isMinHeap());
				n--;
		}break;
		case "Integer":
		while(n > 0) {
			String[] line = sc.nextLine().split(" ");
			Integer[] sr = new Integer[line.length];
			for (int i = 0; i < line.length; i++) {
					sr[i] = Integer.parseInt(line[i]);
				}MinHeap<Integer> mh = new MinHeap<Integer>(sr);
				System.out.println(mh.isMinHeap());
				n--;
		}break;
		case "Double":
		while(n > 0) {
			String[] line = sc.nextLine().split(" ");
			Double[] d = new Double[line.length];
			for (int i = 0; i < line.length; i++) {
				d[i] = Double.parseDouble(line[i]);
			}
			MinHeap<Double> mh = new MinHeap<Double>(d);
			System.out.println(mh.isMinHeap());
			n--;
		}break;
		case "Float":
		while(n > 0) {
			String[] line = sc.nextLine().split(" ");
			Float[] f = new Float[line.length];
			for (int i = 0; i < line.length; i++) {
				f[i] = Float.parseFloat(line[i]);
			}
			MinHeap<Float> mh = new MinHeap<Float>(f);
			System.out.println(mh.isMinHeap());
			n--;
		}break;
	}
	}
}