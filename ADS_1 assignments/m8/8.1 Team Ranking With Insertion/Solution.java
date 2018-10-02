import java.util.Scanner;

class Ranking {

	private String country;
	private int wins;
	private int losses;
	private int draws;

	Ranking(String c, int w, int l, int d) {
		this.country = c;
		this.wins = w;
		this.losses = l;
		this.draws = d;
	}

	public String getCountry() {
		return this.country;
	}

	public int getWins() {
		return this.wins;
	}

	public int getLosses() {
		return this.losses;

	}

	public int getDraws() {
		return this.draws;
	}

	public int compareTo(Ranking that) {
		if (this.getWins() < that.getWins()) {
			return 1;
		} else if (this.getWins() > that.getWins()) {
			return -1;
		} else {
		if (this.getLosses() < that.getLosses()) {
			return -1;
		} else if (this.getLosses() > that.getLosses()) {
			return 1;
		} else {
			if (this.getDraws() < that.getDraws()) {
				return 1;
			} else if (this.getDraws() > that.getDraws()) {
				return -1;
			}
		}
		} return 0;
	}
}

class Sorting {

	private Ranking[] ranking;
	private int size;

	Sorting() {
		ranking = new Ranking[100];
		size = 0;
	}

	public void add(Ranking r) {
		ranking[size++] = r;
	}

	public void sort() {
		for (int i = 1; i < size; i++) {
			Ranking rank = ranking[i];
			int j = i - 1;
			int count = rank.compareTo(ranking[j]);
			while (j >= 0 && count == -1) {
				ranking[j + 1] = ranking[j];
				j--;
				if (j >= 0) {
					count = rank.compareTo(ranking[j]);
				}
			} ranking[j+1] = rank;
		}
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(ranking[i].getCountry() + ",");
		}
		System.out.println();

	}

}



public class Solution {

	private Solution() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sorting r = new Sorting();
		while(sc.hasNext()) {
			String[] tokens = sc.nextLine().split(",");
			r.add(new Ranking((tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])));
		} r.sort();
		r.display();
	}
}