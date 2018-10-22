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
        return this.getName().compareTo(that.getName());
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
        for (int i = 0; i < (2 + 2 + 2) ; i++) {
            for (int j = 0; j < (2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2); j++) {
                String[] tokens = sc.nextLine().split(",");
            minpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
            maxpq.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
            }//System.out.println(minpq.delMin());

            for (int k = 0; k < (2 + 2 + 1); k++) {
            Stock s = minpq.delMin();
             System.out.print(minpq.delMin().getName() + " ");
             System.out.println(minpq.delMin().getPercent());
            }
            System.out.println();

            for (int l = 0; l < (2 + 2 + 1); l++) {
            Stock s = maxpq.delMax();
             System.out.print(maxpq.delMax().getName() + " ");
             System.out.println(maxpq.delMax().getPercent());
            //}
        }
        System.out.println();

        }
            }
        }
