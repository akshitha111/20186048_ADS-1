import java.util.Scanner;
/**
 * Class for node.
 */
class Node {
    /**
     * { this is an int variable for value }.
     */
    private int value;
    /**
     * { this is a node variable for friend }.
     */
    private Node friend;
    /**
     * this is a constructor.
     *
     * @param      v     { int value }.
     * @param      f     { node friend }.
     */
    Node(final int v, final Node f) {
        this.value = v;
        this.friend = f;
    }
    /**
     * Sets the friend.
     *
     * @param      f     { node friend }.
     */
    public void setFriend(final Node f) {
        this.friend = f;
    }
    /**
     * Sets the value.
     *
     * @param      v     { int value }.
     */
    public void setValue(final int v) {
        this.value = v;
    }
    /**
     * Gets the value.
     *
     * @return     The value.
     */
    public int getValue() {
        return this.value;
    }
    /**
     * Gets the friend.
     *
     * @return     The friend.
     */
    public Node getFriend() {
        return this.friend;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.value + "";
    }
}
/**
 * Class for steque.
 */
class Steque {
    /**
     * { this is a node variable for head and tail }.
     */
private Node head, tail;
/**
 * { this is an int variable for size }.
 */
private int size;
/**
 * time complexity of steque() is 1.
 */
    Steque() {
    this.tail = null;
    this.head = tail;
    this.size = 0;
    }


/**
 * inserts element at first of list.
 * time complexity for push() is 1.
 *
 * @param      value  The value
 */
public void push(final int value) {
    Node old = head;
    head = new Node(value, old);
    if (old == null) {
        tail = head;
    }
        size++;
}

/**
 * remove element at beginning of the list
   time complexity for pop() is 1.
 */
public void pop() {
        if (head != null && tail != null) {
            if (head.getFriend() == null && tail.getFriend() == null) {
                tail = null;
                head = tail;
                size--;
            } else if (head != null) {
                head = head.getFriend();
                size--;
            }
        }
    }
/**
 * inserts element at end of list.
   time complexity of enqueue() is 1.
 *
 * @param      value  int value
 */
public void enqueue(final int value) {
        if (tail == null && head == null) {
            tail = new Node(value, null);
            head = tail;
        } else if (tail != null) {
            Node oldtail = tail;
            tail = new Node(value, null);
            oldtail.setFriend(tail);
        }
        size++;
    }
/**
 * timecomplexity for tostring() is n
   n is the size of the list.
 *
 * @return     String representation of the object.
 */
public String toString() {
    StringBuffer sb = new StringBuffer("");
    if (size == 0) {
    sb.append("Steque is empty.");
    return sb.toString();
    } else {
    Node temp = head;
    while (temp != null) {
        sb.append(temp + ", ");
        temp = temp.getFriend();
    }
}
return sb.toString().substring(0, sb.length() - 2);
}
}

/**
 * Class for solution.
 */
final class Solution {
/**
 * Constructs the object.
 */
    private Solution() {
        //unused constructor.

    }
    /**
     * { Client program }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            Steque st = new Steque();
                while (sc.hasNext()) {
                    String[] tokens = sc.nextLine().split(" ");
                switch (tokens[0]) {
                    case "push":
                        st.push(Integer.parseInt(tokens[1]));
                        System.out.println(st);
                        break;
                    case "enqueue":
                        st.enqueue(Integer.parseInt(tokens[1]));
                        System.out.println(st);
                        break;
                    case "pop":
                        st.pop();
                        System.out.println(st);
                        break;
                    default:
                        st = new Steque();
                        System.out.println();
                        break;
                }
            } n--;
        }
    }
}