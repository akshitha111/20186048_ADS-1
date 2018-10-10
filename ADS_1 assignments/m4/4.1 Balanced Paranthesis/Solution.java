import java.util.Scanner;
/**
 * Linked list class.
 */

class LinkedList {
    /**
     * {Variable head of type Node}.
     */
    private Node head;
    /**
     * this is a node class.
     */
    private class Node {
        /**
         * {Variable item of type char}.
         */
        private char item;
        /**
         * {Variable next of type node}.
         */
        private Node next;
    }

    /**
     * this is a constructor.
     */
    LinkedList() {
        this.head = null;
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return (head == null);
    }
    /**
     * {Method to get the last element from stack}.
     *
     * @return     {Character}
     */
    public char pop() {
        if (head != null) {
            char value = head.item;
            head = head.next;
            return value;
        }
        return '\0';
    }
    /**
     * {Method to push a character into the stack}.
     *
     * @param      value  char value
     */
    public void push(final char value) {
        Node oldHead = head;
        head = new Node();
        head.item = value;
        head.next = oldHead;
    }
}
/**
 * this is a Class solution.
 */
public final class Solution {
    /**
     * this is the Constructor.
     */
    private Solution() {
    }
    /**
     * {this is the main method}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int j = 0;

        while (j < n) {
            boolean b = isBalanced(sc);

            if (b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            j++;
        }
    }
    /**
     * {Method to check whether the parenthesis are balanced or not}.
     *
     * @param      scan  The scanner object
     *
     * @return     {Boolean}
     */
    public static boolean isBalanced(final Scanner scan) {
        boolean b = false;
        LinkedList l = new LinkedList();
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                l.push(ch);
            } else if (l.isEmpty()) {
                b = false;
                return b;
            } else if (ch == ')') {
                if (l == null || l.pop() != '(') {
                    b = false;
                    return b;
                }
            } else if (ch == ']') {
                if (l == null || l.pop() != '[') {
                    b = false;
                    return b;
                }
            } else if (ch == '}') {
                if (l == null || l.pop() != '{') {
                    b = false;
                    return b;
                }
            }
        }
        if (l.isEmpty()) {
            return true;
        }
        return false;
    }
}