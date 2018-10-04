import java.util.Scanner;
/**
 * this is a Class for merge.
 */
class Merge {
    /**
     * this is a cutoff to insertion sort.
     */
    private final int x = 7;
    /**
     * this is a constructor.
     * time complexity is 1.
     */
    Merge() {
        //this is an Unused Constructor.
    }
    /**
     * {this is the Method to merge two arrays}.
     * time complexity for this function is N.
     * @param      array  The array
     * @param      aux    The auxiliary
     * @param      lo     The lower value
     * @param      mid    The middle value
     * @param      hi     The higher value
     */
    public void merge(final Comparable[] array, final Comparable[] aux,
        final int lo, final int mid, final int hi) {
        assert isSorted(array, lo, mid);
        assert isSorted(array, mid + 1, hi);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                aux[k] = array[j++];
            } else if (j > hi) {
                aux[k] = array[i++];
            } else if (less(array[j], array[i])) {
                aux[k] = array[j++];
            } else {
                aux[k] = array[i++];
            }
        }
        assert isSorted(aux, lo, hi);
    }

    /**
     * {this is a method for sorting}.
     * time complexity for this function is logN.
     * @param      array  The array
     * @param      aux    The auxiliary array
     * @param      lo     The low value
     * @param      hi     The high value
     */
    public void sort(final Comparable[] array, final Comparable[] aux,
        final int lo, final int hi) {

        if (hi <= lo + x) {
            insertionSort(aux, lo, hi);
            System.out.println("Insertion sort method invoked...");
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(aux, array, lo, mid);
        sort(aux, array, mid + 1, hi);
        if (!less(array[mid + 1], array[mid])) {
            for (int i = lo; i <= hi; i++) {
                aux[i] = array[i];
            }
            System.out.println(
                "Array is already sorted. So, skipped the call to merge...");
            return;
        }
        merge(array, aux, lo, mid, hi);
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     *
     * @param      a     {Comparable array}.
     */
    public void sort(final Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
        assert isSorted(a);
    }

    /**
     * {Method for insertion sort}.
     * sort from a[lo] to a[hi].
     * time complexity for this function is N^2 / 2.
     * @param      a     {Comparable array}.
     * @param      lo    The lower value
     * @param      hi    The higher value
     */
    public void insertionSort(final Comparable[] a, final int lo,
     final int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    /**
     * {Method to exchange two elements in the array}.
     * time complexity for this function is N.
     * @param      a     {Array of objects}
     * @param      i     {Integer  i}
     * @param      j     {Integer j}
     */
    public void exch(final Object[] a, final int i,
     final int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * {Method to check which one is smaller of the two}.
     *
     * @param      a     {Comparable parameter}.
     * @param      b     {Comparable parameter}.
     *
     * @return     {Boolean value}.
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * Method to determine if the array is sorted (or) not.
     *
     * @param      a     {Comparable array}
     *
     * @return     returns True if sorted, False otherwise.
     */
    public boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    /**
     * Method to determine if the array is sorted (or) not.
     *
     * @param      a     {Comparable array}
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    public boolean isSorted(final Comparable[] a,
        final int lo, final int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    /**
     * {Method to print the values of the object array}.
     * time complexity is 1.
     * @param      a     {Name of object array}
     *
     * @return     {String}
     */
    public String display(final Comparable[] a) {

        String st = "[";
        int i;

        for (i = 0; i < a.length - 1; i++) {
            st += a[i] + ", ";
        }
        st += a[i] + "]";
        return st;
    }
}

/**
 * this is a Class for solution.
 */
public final class Solution {
    /**
     * default constructor.
     */
    private Solution() {
        //Unused Constructor.
    }

    /**
     * {This is a Client Program}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Merge merge = new Merge();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            merge.sort(tokens);
            System.out.println(merge.display(tokens));
            System.out.println();
        }
    }
}

