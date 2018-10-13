import java.util.Scanner;
class Stock implements Comparable<Stock> {
	private int name;
	private float percent;
	Stock(int n, float p) {
		this.name = n;
		this.percent = p;
	}
	public int getName() {
		return this.name;
	}
	public float getPercent() {
		return this.percent;
	}
	public int compareTo(final Stock that) {
        if (this.percent > that.percent) {
            return -1;
        }
        if (this.percent < that.percent) {
            return +1;
        }
       	return this.name;	
        }
    
}
    

public final class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		/*Stock s = new Stock(int );*/
		MinPQ<Stock> minpq = new MinPQ<Stock>();
		MaxPQ<Stock> maxpq = new MaxPQ<Stock>();
		Scanner sc = new Scanner(System.in);
		int noOfStocks = Integer.parseInt(sc.nextLine());
		while(sc.hasNext())
		{
			for(int i = 0; i < 20; i++) {
				String[] tokens = sc.nextLine().split(",");
			minpq.insert(new Stock(Integer.parseInt(tokens[0]), Float.parseFloat(tokens[1])));
			maxpq.insert(new Stock(Integer.parseInt(tokens[0]), Float.parseFloat(tokens[1])));
			}

			for(int i = 0; i < 5; i++) {
			Stock s = minpq.delMin();
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());

			}System.out.println();

			for(int  i = 0; i < 5; i++) {
			Stock s = maxpq.delMax();
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());
			//}
		}System.out.println();

		}
			}
		}