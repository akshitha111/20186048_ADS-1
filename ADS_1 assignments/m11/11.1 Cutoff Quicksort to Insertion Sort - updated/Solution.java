import java.util.Scanner;
/**
 * this is a sorting class.
 */
class Sorting {
    /**
     * Constructs the object.
     * time complexity is 1.
     */
    Sorting() {
        /**
         * default constructor.
         */
    }
    /**
     * { insertion sort fucntion }
     * time complexity for this method is (N^2).
     * @param      arr  The arguments
     * @param      low  The arguments
     * @param      high  The arguments
     */
    public void insertion(final Comparable[] arr, final int low,
     final int high) {
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low && less(arr[j], arr[j - 1]); j--) {
                swap(arr, j, j - 1);
            }
        }
    }


    /**
     * { function used for swaping. }
     * time complexity of this method is 1.
     * @param      arr  The arguments
     * @param      j  The arguments
     * @param      min  The arguments
     */
    public void swap(final Comparable[] arr, final int j, final int min) {
        Comparable temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }

    /**
     * Returns a string representation of the object.
     * time complexity is N.
     * @param      arr   The arr
     *
     * @return     String representation of the object.
     */
    public String toString(final Comparable[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";
        return str;
    }

    /**
     * {this is a sorting function }
     * time complexity is logN.
     * @param      arr  The arguments
     * @param      low  The arguments
     * @param      high  The arguments
     * @param      cutOff  The arguments
     */
    public void sort(final Comparable[] arr, final int low,
     final int high, final int cutOff) {
        if (high <= low + cutOff - 1) {
            insertion(arr, low, high);
            System.out.println("insertionSort called");
            return;
        }
        int k = partition(arr, low, high);
        System.out.println(toString(arr));
        sort(arr, low, k - 1, cutOff);
        sort(arr, k + 1, high, cutOff);
    }

    /**.
     * { function used for sorting }
     * time complexity is 1.
     * @param      array   The array
     * @param      cutOff  The cut off
     */
    public void sort(final Comparable[] array, final int cutOff) {
        sort(array, 0, array.length - 1, cutOff);
    }


    /**
     * { function used for partition of array }
     * time complexity is N.
     * @param      arr   The arr
     * @param      low   The low
     * @param      high  The high
     *
     * @return     { integer value is returned }
     */
    public int partition(final Comparable[] arr,
     final int low, final int high) {
        int i = low;
        int j = high + 1;

        while (true) {
            while (less(arr[++i], arr[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(arr[low], arr[--j])) {
                if (j == low) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
           swap(arr, i, j); 
        }
        swap(arr, low, j);
        return j;
    }


    /**
     * { function to find which element is less }
     * time complexity is 1.
     * @param      a     { element }
     * @param      b     { element }
     *
     * @return     { boolean is returned }
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
}

/**
 * this is a solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * { unused constructor }.
         */
    }
    /**
     * { Client program }
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting s = new Sorting();
        int testcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testcases; i++) {
            int j = Integer.parseInt(sc.nextLine());
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
                s.sort(tokens, j);
                System.out.println(s.toString(tokens));
            }
        }
    }
}



