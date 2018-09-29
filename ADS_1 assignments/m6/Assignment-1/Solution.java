import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
/**
 * Class for add large numbers.
 */

final class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {

    }
    /**
     * { function_description }.
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
            LinkedList one = new LinkedList(Arrays.asList(number));
            Iterator iterator = one.iterator();
            while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        } return one;
    }

    /*public static String digitsToNumber(LinkedList list) {
        return;
    }*/
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
     final LinkedList list2) {
            LinkedList a = list1;
            LinkedList b = list2;
            LinkedList c;
            int sum = 0;
            int carry;
            for (int i = list1.size(); i > 0; i--) {
                for (int j = list2.size(); j > 0; j--) {
                   sum += (j + i);
                   if (sum > 2 * 2 * 2 + 2) {
                    sum = sum % 2 * 2 * 2 + 2;
                    } //c = sum;
                   }

                } return b;
            }
}
/**
 * { item_description }.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                /*System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));*/
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(
                    pDigits, qDigits);
                //System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;

            default:
                break;
        }
    }
}








