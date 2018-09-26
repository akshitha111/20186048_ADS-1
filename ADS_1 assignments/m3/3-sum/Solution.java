import java.util.Arrays;
import java.util.Scanner;
/**
 * This is a class solution.
 */
public final class Solution {
    /**
     * Constructs the object for solution class.
     */
    private Solution() {

    }
    /**
     * This is a main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int arr = input.nextInt();
        int[] sum = new int[arr];
        for (int i = 0; i < arr; i++) {
            sum[i] = input.nextInt();
        }
        Arrays.sort(sum);
        int count = 0;
        for (int i = 0; i < arr - 2; i++) {
            int j = i + 1;
            int k = arr - 1;
            while (j < k) {
                if (sum[i] + sum[j] + sum[k] == 0) {
                    count++;
                    j++;
                    k--;
                } else if (sum[i] + sum[j] + sum[k] < 0) {
                    j++;

                } else {
                    k--;
                }
            }

        }
        System.out.println(count);

    }
}




