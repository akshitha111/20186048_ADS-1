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
	// create n-by-n grid, with all sites blocked
   public Percolation(int n1) {
   	this.n = n1;
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

   // open site (row, col) if it is not open already        
   public void open(int row, int col) {
   	int index = indexOf(row, col);
   	connected[index] = true;
   	/*if (n == 2 ) {
   		wqf.union(first, index);
   		wqf.union(last, index);
   	}*/
   	int bottom = index + n;
   	int top = index - n;
   	if (bottom < size) {
   		LinkOpenSites(index, bottom);
   		return;
   	} 
   	if (top >= 0) {
   		LinkOpenSites(index, top);
   	}
   	if(col == 0) {
   		if(col !=n) {
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
   /*public boolean isFull(int row, int col) {
   	return false;
   }
    // number of open sites
   public int numberOfOpenSites() {
   	return -1;

   }    */
     // does the system percolate?
   public boolean percolates() {
   	return wqf.connected(first, last);

   }             
}

/*
// You can implement the above API to solve the problem
class Percolation {

	private boolean[][] grid;
    private WeightedQuickUnionUF wqf;
    private int gridSize;

	public Percolation(int n) {
		gridSize = N;
        grid = new boolean[N][N];
        wqf = new WeightedQuickUnionUF((N*N));
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                grid[i][j] = false;
            }
        }

	}

	public void open(int row, int col) {
		int ai = i-1;
        int aj = j-1;
        grid[ai][aj] = true;
        if (ai-1 >= 0 && isOpen(i - 1, j))  //left
        {
            wqf.union(to2D(i,j),to2D(i-1,j));
        }
        if (ai+1 < gridSize && isOpen(i + 1, j))         //right
        {
            wqf.union(to2D(i,j),to2D(i+1,j));
        }
        if (aj-1 >= 0 && isOpen(i, j-1))     //up
        {
            wqf.union(to2D(i,j),to2D(i,j-1));
        }
        if (aj+1 < gridSize && isOpen(i, j+1))     //down
        {
            wqf.union(to2D(i,j),to2D(i,j+1));
        }

	}

	public boolean isOpen(int row, int col) {
		return grid[i-1][j-1];
	}

	public boolean isFull(int row, int col) {
		if(isOpen(i,j))
        {
            for(int k = 0; k < gridSize; k++)
            {

               if(wqf.connected(to2D(i,j),k)) return true;
            }
        }
        return false;
	}

	public int numberOfOpenSites() {

	}

	public boolean percolates() {
		if (gridSize == 1)
        {
            if (isOpen(1,1))
            {
                return true;
            }
            return false;
        }
        if(gridSize == 2)
        {
            if (wqf.connected(0,3)) return true;
            if (wqf.connected(1,2)) return true;
            if (wqf.connected(0,2)) return true;
            if (wqf.connected(1,3)) return true;
            return false;
        }


        for (int i = (gridSize * (gridSize - 1))-1; i < (gridSize * gridSize); i++)
        {
           // System.out.println((gridSize * (gridSize - 1))-1);
            //System.out.println(gridSize * gridSize-1);
            for (int i2 = 0; i2 < gridSize; i2++)
            {
                //System.out.println(i);
                //System.out.println(i2);
                //System.out.print(wqf.connected(i, i2));
                if (wqf.connected(i, i2)) return true;

            }
        }
        return false;

	}
}*/


public final class Solution {

	private Solution() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Percolation p = new Percolation(n);
		while(sc.hasNext()) {
			String [] tokens = sc.nextLine().split(" ");
			p.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		}
		System.out.println(p.percolates());

	}
}