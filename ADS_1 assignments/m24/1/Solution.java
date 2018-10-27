import java.util.Scanner;
class Student {
	private int rollNumber;
	private String name;
	private float marks;
	Student(String n, int r, float m) {
		this.name = n;
		this.rollNumber = r;
		this.marks= m;
	}
	/*public String toString() {

	}*/

}
class Solution{

	Solution() {

	}public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			String[] tokens =  sc.nextLine().split(",");
			//System.out.println(tokens);
		}
		int noOfQueries = sc.nextInt();
		for(int i = 0; i < noOfQueries; i++) {
			String[] check = sc.nextLine().split(" ");
			System.out.println(check);
		}
	}
}