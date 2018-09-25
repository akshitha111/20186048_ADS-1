import java.util.Scanner;
/**
 * Class for percolation.
 */
class Percolation {
	/**
	 * { var_description }
	 */
	private WeightedQuickUnionUF wqf;

	private int n;
	private int size;
	private int first;
	private int last;
	private boolean[] connected;
	private int count;
	// create n-by-n grid, with all sites blocked
   public Percolation(int n1) {
   	this.n = n1;
   	this.count = 0;
   	this.size = n1 * n1;
   	this.first = size;
   	this.last = size + 1;
   	connected = new boolean[size];
   	wqf = new WeightedQuickUnionUF(size + 2);
   	for (int i = 0; i < n; i++) {
   		wqf.union(first, i);
   		wqf.union(last, size - i - 1);
   	}
   }   

   public int indexOf(int i, int j) {
   		return n * (i - 1) + j - 1;
   }

   private void LinkOpenSites(int row, int col) {
   	if (connected[col] && !wqf.connected(row, col))
   	{
   		wqf.union(row, col);
   	}
   }

   public int numberOfOpenSites() {
   	return count;
   }

   // open site (row, col) if it is not open already        
   public void open(int row, int col) {
   	int index = indexOf(row, col);
   	connected[index] = true;
   	int bottom = index + n;
   	int top = index - n;
   	if (n == 1) {
   		wqf.union(first, index);
   		wqf.union(last, index);

   	}
   	if (bottom < size) {
   		LinkOpenSites(index, bottom);
   		return;
   	} 
   	if (top >= 0) {
   		LinkOpenSites(index, top);
   	}
   	if(col == 1) {
   		if(col != n) {
   			LinkOpenSites(index, index + 1);

   		}return;
   	} if (col == n) {
   		LinkOpenSites(index, index - 1);
   		return;
   	}
   	LinkOpenSites(index, index + 1);
   	LinkOpenSites(index, index - 1);


   } 
      // is site (row, col) open?
   public boolean isOpen(int row, int col) {

     // is site (row, col) full?
   	return connected[indexOf(row, col)];
   }
    
     // does the system percolate?
   public boolean percolates() {
   	return wqf.connected(first, last);

   }             
}



public final class Solution {

	private Solution() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Percolation p = new Percolation(n);
		int i = 0;
		while(sc.hasNext()) {
			String [] tokens = sc.nextLine().split(" ");
			p.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
			i++;
		}
		System.out.println(p.percolates() && p.numberOfOpenSites() != 0);

	}
}