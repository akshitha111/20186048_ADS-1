import java.util.Scanner;
/**
 * Class for percolation.
 */
class Percolation {
    /**
     * { object creation }.
     */
    private WeightedQuickUnionUF wqf;
    /**
     * varaiable n.
     */
    private int n;
    /**
     * { size variable }.
     */
    private int size;
    /**
     * first variable.
     */
    private int first;
    /**
     * last variable.
     */
    private int last;
    /**
     * boolean array.
     */
    private boolean[] connected;
    /**
     * variable count.
     */
    private int count;
    /**
     * constructor for percolation class.
     *
     * @param      n1    The n 1
     */
    Percolation(final int n1) {
    /**
     * assigning n1 to n.
     */
    this.n = n1;
    /**
     * initializing count.
     */
    this.count = 0;
    /**
     * initializing count variable.
     */
    this.size = n1 * n1;
    /**
     * initializing first variable.
     */
    this.first = size;
    /**
     * initializing last variable.
     */
    this.last = size + 1;
    connected = new boolean[size];
    wqf = new WeightedQuickUnionUF(size + 2);
    for (int i = 0; i < n; i++) {
        wqf.union(first, i);
        wqf.union(last, size - i - 1);
    }
   }
   /**
    * the function indexOf.
    *
    * @param      i     { integer variable }
    * @param      j     { integer variable }
    *
    * @return     { returnz the index }
    */
   public int indexOf(final int i, final int j) {
        return n * (i - 1) + j - 1;
   }
   /**
    * Links open sites.
    *
    * @param      row   The row
    * @param      col   The col
    */
   private void linkOpenSites(final int row, final int col) {
    if (connected[col] && !wqf.connected(row, col)) {
        wqf.union(row, col);
    }
   }
   /**
    * to count number of open sites.
    *
    * @return     { number of open sites }.
    */
   public int numberOfOpenSites() {
    return count;
   }

    /**
     * the open function.
     *
     * @param      row   The row
     * @param      col   The col
     */
   public void open(final int row, final int col) {
    int index = indexOf(row, col);
    connected[index] = true;
    count++;
    int bottom = index + n;
    int top = index - n;
    if (n == 1) {
        wqf.union(first, index);
        wqf.union(last, index);

    }
    if (bottom < size) {
        linkOpenSites(index, bottom);
    }
    if (top >= 0) {
        linkOpenSites(index, top);
    }
    if (col == 1) {
        if (col != n) {
            linkOpenSites(index, index + 1);
        }
        return;
    }
    if (col == n) {
        linkOpenSites(index, index - 1);
        return;
    }
    linkOpenSites(index, index + 1);
    linkOpenSites(index, index - 1);


   }
      /**
       * boolean isOpen function.
       *
       * @param      row   The row
       * @param      col   The col
       *
       * @return     True if open, False otherwise.
       */
   public boolean isOpen(final int row, final int col) {
    return connected[indexOf(row, col)];
   }
     /**
      * the function percolates.
      *
      * @return     { boolean value }.
      */
   public boolean percolates() {
    return wqf.connected(first, last);

   }
}
/**
 * this is a solution class.
 */
public final class Solution {
    /**
     * this is a class constructor.
     */
    private Solution() {

    }
    /**
     * this is a main class.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Percolation p = new Percolation(n);
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(" ");
            p.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        }
        System.out.println(p.percolates() && p.numberOfOpenSites() != 0);

    }
}




