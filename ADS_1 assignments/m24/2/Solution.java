import java.util.Scanner;
class Student {
	private int rollNumber;
	private String name;
	private double marks;
	Student(int r, String n, double m) {
		this.rollNumber = r;
		this.name = n;
		this.marks= m;
	}
	public int getRollNumber() {
		return this.rollNumber;
	}

	public String getName() {
		return this.name;
	}

	public double getMarks() {
		return this.marks;
	}

	/*public int compareTo(final Object object) {
        Student that = (Student) object;
        return this.name.compareTo(that.name);
    }*/

    public String toString() {
    	return this.getName();
    }
}



class Solution {
	Solution() {
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			BinarySearchST<String, Integer> bstobj = new BinarySearchST<String, Integer>();
			int a = Integer.parseInt(sc.nextLine());
		while(a > 0) {
			String[] check = sc.nextLine().split(",");
			Student s = new Student(Integer.parseInt(check[0]), (check[1]), Double.parseDouble(check[2]));
			//bstobj.put(s, check[1]);
			bstobj.put("Clark", 141);
			a--;
		}
		int b = Integer.parseInt(sc.nextLine());
		while(b > 0) {
			String[] check = sc.nextLine().split(" ");
			switch(check[0]) {
				case "BE":
					bstobj.keys(check[1], check[2]);
					break;
				case "LE":
                Student s = new Student(Integer.parseInt(check[1]),
                    check[2], Float.parseFloat(check[2 + 1]));
                System.out.println(bstobj.floor(check[1]));
                break;
			}
			b--;
		}

		}
	}
