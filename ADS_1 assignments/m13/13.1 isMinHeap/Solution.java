import java.util.Scanner;
/**
 * Class for minimum heap.
 *
 * @param      <E>   { generic variable }.
 */
class MinHeap<E extends Comparable<E>>  {
    /**
     * { this is a generic array }.
     */
    private E[] arr;
    /**
     * this is a constructor.
     * time complexity is 1.
     * @param      str   The string
     */
    MinHeap(final E[] str) {
        this.arr = str;
    }
    /**
     * Determines if it is minimum heap.
     * time complexity is N.
     * @return     True if minimum heap, False otherwise.
     */
    public boolean isMinHeap() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!less(arr[i], arr[i + 1])) {
                return false;
            }
        }
        return true;
    }
    /**
     * { this is function to compare elements }.
     *
     * @param      i     { one element }.
     * @param      j     { second element }.
     * time complexity is 1.
     * @return     { boolean is returned }.
     */
    public boolean less(final E i, final E j) {
        return i.compareTo(j) <= 0;
        }
    }
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * this is a constructor.
     */
    private Solution() {
        //unused constructor.

    }
    /**
     * { Client Program }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        switch (st) {
        case "String":
        while (n > 0) {
            String[] line = sc.nextLine().split(",");
            MinHeap<String> mh = new MinHeap<String>(line);
                System.out.println(mh.isMinHeap());
                n--;
        } break;
        case "Integer":
        while (n > 0) {
            String[] line = sc.nextLine().split(",");
            Integer[] sr = new Integer[line.length];
            for (int i = 0; i < line.length; i++) {
                    sr[i] = Integer.parseInt(line[i]);
                }
                MinHeap<Integer> mh = new MinHeap<Integer>(sr);
                System.out.println(mh.isMinHeap());
                n--;
        } break;
        case "Double":
        while (n > 0) {
            String[] line = sc.nextLine().split(",");
            Double[] d = new Double[line.length];
            for (int i = 0; i < line.length; i++) {
                d[i] = Double.parseDouble(line[i]);
            }
            MinHeap<Double> mh = new MinHeap<Double>(d);
            System.out.println(mh.isMinHeap());
            n--;
        } break;
        case "Float":
        while (n > 0) {
            String s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("false");
                break;
            } else {
            String[] line = s.split(",");
            Float[] f = new Float[line.length];
            for (int i = 0; i < line.length; i++) {
                f[i] = Float.parseFloat(line[i]);
            }
            MinHeap<Float> mh = new MinHeap<Float>(f);
            System.out.println(mh.isMinHeap());
            n--;
        }
        }
        break;
        default:
        break;
    }
    }
}





