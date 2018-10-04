/**
 * this is a Class for node.
 */
class Node {
    /**
     * { this is a string variable }.
     */
    String value;
    /**
     * { this is a node variable }.
     */
    Node next;
    /**
     * Constructs the object.
     *
     * @param      v     { String variable }
     */
    Node(final String v) {
        this.value = v;
    }
}

/**
 * this is a LinkedList class.
 */
class LinkedList {
    /**
     * { this is a node variable }.
     */
    private Node head;
    /**
     * { this is a size variable }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    LinkedList() {
        head = null;
        size = 0;
    }
    /**
     * { insertAt function with two parameters }.
     *
     * @param      position   The int position
     * @param      value      The String value
     *
     * @throws     Exception  { if there is invalid index }
     */
    public void insertAt(final int position,
     final String value) throws Exception {
        if (position < 0 || position > size) {
        throw new Exception();
        }
        Node obj = new Node(value);
        head = insertAt(position, head, obj, 0);
    }

    /**
     * { insertAt function with 4 parameters }.
     *
     * @param      position   The int position
     * @param      first      The Node first
     * @param      obj        The Node object
     * @param      count      The int count
     *
     * @return     { Node object is returned }
     *
     * @throws     Exception  { if there is invalid index }
     */
    public Node insertAt(final int position, final Node first,
     final Node obj, final int count) throws Exception {
        if (position == count) {
            obj.next = first;
            size++;
            return obj;
        }
        first.next = insertAt(position, first.next, obj, count + 1);
        return first;
    }
    /**
     * { this is a function for reverse }.
     */
    public void reverse() {
        reverse(null, head);
    }
    /**
     * { this is a function for reverse }.
     *
     * @param      previous  The previous
     * @param      current   The current
     */
    public void reverse(final Node previous, final Node current) {
        if (current != null) {
            reverse(current, current.next);
            current.next = previous;
        } else {
            head = previous;
        }
    }
    /**
     * { this is a function for show }.
     */
    public void show() {
        Node temp = head;
        String str = "";
        while (temp != null) {
            str += temp.value + ", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0, str.length() - 2));

    }
    }

