import java.util.Scanner;
class Stock implements Comparable<Stock> {
	private String name;
	private float percent;
	Stock(String n, float p) {
		this.name = n;
		this.percent = p;
	}
	public String getName() {
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
        return 0;
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
		//System.out.println(noOfStocks);
		for(int i = 0; i < 20; i++) {
			String[] tokens = sc.nextLine().split(",");
			//System.out.println(tokens);
			minpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
			maxpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
		}
		
		//while(!maxpq.isEmpty() ) {
			/*Stock s = maxpq.delMax();
			s = minpq.delMin();
			System.out.println(s.compareTo(tokens[1]));
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());*/
		//}
	
		//while(!minpq.isEmpty()) {
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
		}

		while(sc.hasNext())
		{
			for(int i = 0; i < 20; i++) {
				String[] tokens = sc.nextLine().split(",");
			//System.out.println(tokens);
			minpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
			maxpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
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
		}
		}
			/*for( i = 5; i < 10; i++) {
			Stock s = minpq.delMin();
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());

			}*/
		



		/*while(!maxpq.isEmpty() ) {
			//for(int i = 0; i < 5; i++) {
			 Stock s = maxpq.delMax();
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());
			 //System.out.println();
			//}
			}*/
		

		
		
		//}

		
	//}
		//System.out.println(getPercent());
		//int noOfQueries = Integer.parseInt(sc.nextLine());
		//System.out.println(noOfQueries);
		//if(noOfQueries > 0) {
			/*for(int i = 0; i < noOfQueries; i++) {
				String[] check = sc.nextLine().split(",");*/
				//System.out.println(check[0]);
			//}
		//}
	}
}