import java.util.Scanner;
/**
     * this is a class for solution.
     */
public final class Solution {
    /**
     * default constructor.
     */
    private Solution() {
        //unused constructor
    }
    /**
     * Client program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (s.hasNextLine()) {
            String[] tokens = s.nextLine().split(" ");
            switch (tokens[0]) {
                case "insertAt" :
                try {
                ll.insertAt(Integer.parseInt(tokens[1]), tokens[2]);
                ll.show();
                } catch (Exception e) {
                    System.out.println("Can't insert at this position.");
                }
                break;
                case "reverse" :
                try {
                ll.reverse();
                ll.show();
                } catch (Exception e) {
                System.out.println("No elements to reverse.");
                }
                break;
                default:
                break;
            }
        }
    }
}


