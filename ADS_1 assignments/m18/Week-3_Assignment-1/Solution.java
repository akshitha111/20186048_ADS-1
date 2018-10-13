import java.util.Scanner;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**
	 * { var_description }
	 */
	private String name;
	/**
	 * { var_description }
	 */
	private float percent;
	/**
	 * Constructs the object.
	 *
	 * @param      n     { parameter_description }
	 * @param      p     { parameter_description }
	 */
	Stock(String n, float p) {
		this.name = n;
		this.percent = p;
	}
	/**
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return this.name;
	}
	public float getPercent() {
		return this.percent;
	}
	public void setName(Stock that) {
		if(this.percent == that.percent) {
			System.out.println(this.name);
		}
	}
	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
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
		MinPQ<Stock> minpq = new MinPQ<Stock>();
		MaxPQ<Stock> maxpq = new MaxPQ<Stock>();
		Scanner sc = new Scanner(System.in);
		int noOfStocks = Integer.parseInt(sc.nextLine());
		//while(sc.hasNext())
		for(int i = 0; i < 6 * noOfStocks; i++)
		{
			for( i = 0; i < 20; i++) {
				String[] tokens = sc.nextLine().split(",");
			minpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
			maxpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
			}

			for(i = 0; i < 5; i++) {
			Stock s = minpq.delMin();
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());
			}System.out.println();

			for( i = 0; i < 5; i++) {
			Stock s = maxpq.delMax();
			 System.out.print(s.getName() + " ");
			 System.out.println(s.getPercent());
			//}
		}System.out.println();

		}
			}
		}