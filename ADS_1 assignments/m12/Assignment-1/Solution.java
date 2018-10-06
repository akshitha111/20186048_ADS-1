import java.util.Scanner;
class Student {

	private String name;
	private int date;
	private int month;
	private int year;
	private int subjectOne;
	private int subjectTwo;
	private int subjectThree;
	private int total;
	private String reservationCatergory;
	Student(String n, int d, int m, int y, int s1, int s2, int s3, int tot, String rc) {
		this.name = n;
		this.date = d;
		this.month = m;
		this.year = y;
		this.subjectOne = s1;
		this.subjectTwo = s2;
		this.subjectThree = s3;
		this.total = tot;
		this.reservationCatergory = rc;
	}

	
	public String getName() {
		return this.name;
	}

	public int getDate() {
		return this.date;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public int getSubjectOne() {
		return this.subjectOne;
	}

	public int getSubjectTwo() {
		return this.subjectTwo;
	}

	public int getSubjectThree() {
		return this.subjectThree;
	}

	public int getTotal() {
		return this.total;
	}

	public String getReservationCat() {
		return this.reservationCatergory;
	}

	public int compareTo(final Student that) {
		if(this.getTotal() < that.getTotal()) {
			return 1;
		} else if(this.getTotal() > that.getTotal()) {
			return -1;
		} else {
			if(this.getSubjectThree() < that.getSubjectThree()) {
				return 1;
			} else if(this.getSubjectThree() > that.getSubjectThree()) {
				return -1;
			} else {
				if(this.getSubjectTwo() < that.getSubjectTwo()) {
					return 1;
			} else if(this.getSubjectTwo() > that.getSubjectTwo()) {
					return -1;
		} else {
			if(this.getSubjectOne() < that.getSubjectOne()) {
				return 1;
		} else if(this.getSubjectOne() > that.getSubjectOne()) {
			return -1;
		} else {
			if(this.getYear() < that.getYear()) {
				return -1;
			} else if(this.getYear() > that.getYear()) {
				return 1;
			}
				if(this.getMonth() < that.getMonth()) {
					return -1;
				} else if(this.getMonth() > that.getMonth()) {
					return 1;
				} else {
					if(this.getDate() < that.getDate()) {
						return -1;
					} else if(this.getDate() > that.getDate()) {
						return 1;
					}
				}
			}
		}

	
}
}return 0;
}
}



class Sorting {
	private final int oneHundred = 100;
	private Student[] student;
	private int size;
	Sorting() {
		student = new Student[100];
		size = 0;
	}

	public void add(final Student s) {
		student[size] = s;
		size++;
	}

	public void sort() {
		for (int i = 1; i < size; i++) {
			Student stu = student[i];
			int j = i - 1;
			int count = stu.compareTo(student[j]);
			while(j >= 0 && count == -1) {
				student[j + 1] = student[j];
				j--;
                if (j >= 0) {
                    count = stu.compareTo(student[j]);
                }
            } student[j + 1] = stu;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += student[i].getName() + "," + student[i].getTotal() + "," + student[i].getReservationCat() + "\n";

        }
        for(int i = 0; i < s.length(); i++) {
            	System.out.println(s);
            }
        return s.substring(0, s.length() - 1);
    }

}

	
/*class Reseravtion {
	Reservation() {
		String[] seats = new String[4];
		for(int i = 0; i < 4; i++) {
			seats.add
		}
		

	}
}*/


public final class Solution {
	private Solution() {
	}public static void main(final String[] args) {		
		Scanner sc = new Scanner(System.in);
		Sorting s = new Sorting();
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int d = Integer.parseInt(sc.nextLine());
		int e = Integer.parseInt(sc.nextLine());
		int f = Integer.parseInt(sc.nextLine());
	while(sc.hasNext()) {
		String[] tokens = sc.nextLine().replace("-", ",").split(",");
		s.add(new Student((tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]), (tokens[8])));
	} s.sort();
	System.out.println(s);

}
}
	
