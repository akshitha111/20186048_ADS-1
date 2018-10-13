import java.util.Scanner;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
    /**
     * { this is a name variable }.
     */
    private String name;
    /**
     * { this ia a percent variable}.
     */
    private float percent;
    /**
     * Constructs the object.
     *
     * @param      n     { String variable }
     * @param      p     { float variable }
     */
    Stock(final String n, final float p) {
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
    /**
     * Gets the percent.
     *
     * @return     The percent.
     */
    public float getPercent() {
        return this.percent;
    }
    /**
     * { this is a function for compareTo }.
     *
     * @param      that  The that
     *
     * @return     { int is returned }
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
/**
* { this is a solution class }.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor
    }
    /**
     * { Client program }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        MinPQ<Stock> minpq = new MinPQ<Stock>();
        MaxPQ<Stock> maxpq = new MaxPQ<Stock>();
        Scanner sc = new Scanner(System.in);
        int noOfStocks = Integer.parseInt(sc.nextLine());
        //while(sc.hasNext())
        for (int i = 0; i < (2 + 2 + 2) * noOfStocks; i++) {
            for (i = 0; i < (2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2); i++) {
                String[] tokens = sc.nextLine().split(",");
            minpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
            maxpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
            }

            for (i = 0; i < (2 + 2 + 1); i++) {
            Stock s = minpq.delMin();
             System.out.print(s.getName() + " ");
             System.out.println(s.getPercent());
            }
            System.out.println();

            for (i = 0; i < (2 + 2 + 1); i++) {
            Stock s = maxpq.delMax();
             System.out.print(s.getName() + " ");
             System.out.println(s.getPercent());
            //}
        }
        System.out.println();

        }
            }
        }




