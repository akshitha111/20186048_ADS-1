import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * This is a Class for book details.
 */
class BookDetails implements Comparable {
    /**
     * this is a name variable.
     */
    private String name;
    /**
     * this is a author varaible.
     */
    private String author;
    /**
     * this is variable for price.
     */
    private float price;
    /**
     * Constructs the object.
     *
     * @param      bookname    The bookname
     * @param      bookauthor  The bookauthor
     * @param      bookprice   The bookprice
     */
    BookDetails(final String bookname,
                final String bookauthor, final float bookprice) {
        this.name = bookname;
        this.author = bookauthor;
        this.price = bookprice;
    }

    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the author.
     *
     * @return     The author.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Gets the price.
     *
     * @return     The price.
     */
    public float getPrice() {
        return this.price;
    }

    /**
     * compare to method that returns integer.
     *
     * @param      object  The object
     *
     * @return  integer.
     */
    public int compareTo(final Object object) {
        BookDetails that = (BookDetails) object;
        return this.name.compareTo(that.name);
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getName() + ", " +  getAuthor() + ", " + getPrice();
    }
}
/**
 * Class for binary search tree.
 */
class BinarySearchTree {
    /**
     * variable for root.
     */
    private Node root;
    /**
     * This is a Class for node.
     */
    private final class Node {
        /**
         * variable for key.
         */
        private BookDetails key;
        /**
         * variable for val.
         */
        private int val;
        /**
         * Node variable.
         */
        private Node left;
        /**
         * Node variable.
         */
        private Node right;
        /**
         * size variable.
         */
        private int size;

        /**
         * Constructs the object.
         *
         * @param      key1   The key
         * @param      val1  The value
         * @param s int size
         */
        private Node(final BookDetails key1, final int val1, final int s) {
            this.key = key1;
            this.val = val1;
            this.size = s;
            left = null;
            right = null;
        }
    }

    /**
     * Constructs the object.
     */
    BinarySearchTree() {
        root = null;
    }
    /**
     * size method.
     *
     * @return size.
     */
    public int size() {
        return size(root);
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return size() == 0;
    }


    /**
     * this is a size overloaded method.
     *
     * @param      x Node
     *
     * @return size.
     */
    private int size(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }

    /**
     * this is a get method.
     *time complexity is logN
     * @param      key   The key
     *
     * @return  integer.
     */
    public int get(final BookDetails key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else if (cmp == 0) {
                return x.val;
            }
        }
        return -1;
    }

    /**
     * this is a put method to insert the key, value.
     *time complexity is 1
     * @param      key   The key
     * @param      val   The value
     */
    public void put(final BookDetails key, final int val) {
        root = put(root, key, val);
    }

    /**
     * overloaded constructor.
     * time complexity is logN
     * @param      x   root node.
     * @param      key   The key
     * @param      val   The value
     *
     * @return root
     */
    private Node put(final Node x, final BookDetails key, final int val) {
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else if (cmp == 0) {
            x.val = val;
        }
        return x;
    }
    /**
     * min element.
     * time complexity is 1.
     * @return minimum.
     */
    public BookDetails min() {
        return min(root).key;
    }

    /**
     * overloaded constructor.
     * time complexity is logN.
     * @param      x Node
     *
     * @return minimum.
     */
    private Node min(final Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }

    /**
     * maximum element.
     * time complexity is 1.
     * @return maximum.
     */
    public BookDetails max() {
        return max(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is logN.
     * @param      x Node
     *
     * @return maximum.
     */
    private Node max(final Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }
    /**
     * floor method.
     * time complexity is 1.
     * @param      key   The key
     *
     * @return  key
     */
    public BookDetails floor(final BookDetails key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     *
     *overloaded constructor.
     *time complexity is logN.
     * @param      x Node
     * @param      key   The key
     *
     * @return floor.
     */
    private Node floor(final Node x, final BookDetails key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp <  0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
    /**
     * ceiling method.
     * time complexity is 1.
     * @param      key   The key
     *
     * @return key.
     */
    public BookDetails ceiling(final BookDetails key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     * overloaded constructor.
     * time complexity is logN.
     * @param      x Node
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node ceiling(final Node x, final BookDetails key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.right, key);
    }

    /**
     * {Select Method}.
     * Time complexity of this method is 1.
     * @param      k     {Integer}
     *
     * @return     {BookDetails Object}
     */
    public BookDetails select(final int k) {
        Node x = select(root, k);
        return x.key;
    }

    /**
     * {Select method}
     * Time complexity of this method is logN.
     * @param      x     {Node}
     * @param      k     {Integer}
     *
     * @return     {Node}
     */
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if (t > k) {
            return select(x.left,  k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else {
            return x;
        }
    }

    /**
     * {Rank}.
     * Time complexity of this method is 1.
     * @param      key   The key
     *
     * @return     {Integer}
     */
    public int rank(final BookDetails key) {
        return rank(key, root);
    }

    /**
     * {Method of rank}.
     * Time complexity of this method is logN.
     * @param      key   The key
     * @param      x     {Node}
     *
     * @return     {Integer}
     */
    private int rank(final BookDetails key, final Node x) {
        if (x == null) {
            return 0;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(key, x.left);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(key, x.right);
        } else {
            return size(x.left);
        }
    }
    /**
     * { function for deleting max element }.
     * time complexity is root N.
     */
    public void deleteMax() {
        if (isEmpty()) {
            //{
                throw new NoSuchElementException("Symbol table underflow");
            }
        root = deleteMax(root);
        //assert check();
    }
    /**
     * { function for deleting max element }.
     * time complexity is root N.
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node deleteMax(final Node x) {
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * { function for deleting min element }.
     * time complexity is root N.
     */
    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table underflow");
        }
        root = deleteMin(root);
       // assert check();
    }
    /**
     * { function for deleteting min element }.
     * time complexity is root N.
     * @param      x     { parameter_description }
     *
     * @return     { node is returned }
     */
    private Node deleteMin(final Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * { function for delete }.
     * time complexity is root N.
     * @param      key   The key
     */
    public void delete(final BookDetails key) {
        if (key == null) {
            throw new IllegalArgumentException(
                "calls delete() with a null key");
        }
        root = delete(root, key);
       // assert check();
    }
    /**
     * { function for delete }.
     * time complexity is root N.
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node delete(final Node x, final BookDetails key) {
        Node x1 = x;
        if (x1 == null) {
            return null;
        }
        int cmp = key.compareTo(x1.key);
        if      (cmp < 0) {
            x1.left  = delete(x1.left,  key);
        } else if (cmp > 0) {
            x1.right = delete(x1.right, key);
        } else {
            if (x1.right == null) {
                return x1.left;
            }
            if (x1.left  == null) {
                return x1.right;
            }
            Node t = x;
            x1 = min(t.right);
            x1.right = deleteMin(t.right);
            x1.left = t.left;
        }
        x1.size = size(x1.left) + size(x1.right) + 1;
        return x;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
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
        BinarySearchTree bstobj = new BinarySearchTree();
        while (sc.hasNext()) {
            String[] check = sc.nextLine().split(",");
            switch (check[0]) {
            case "put":
                BookDetails deobj = new BookDetails(check[1], check[2],
                    Float.parseFloat(check[2 + 1]));
                bstobj.put(deobj, Integer.parseInt(check[2 + 2]));
                break;
            case "get":
                deobj = new BookDetails(check[1], check[2],
                                        Float.parseFloat(check[2 + 1]));
                if (bstobj.get(deobj) == -1) {
                    System.out.println("null");
                } else {
                    System.out.println(bstobj.get(deobj));
                }
                break;
            case "max":
                System.out.println(bstobj.max());
                break;
            case "min":
                System.out.println(bstobj.min());
                break;
            case "select":
                System.out.println(bstobj.select(Integer.parseInt(check[1])));
                break;
            case "floor":
                deobj = new BookDetails(check[1],
                    check[2], Float.parseFloat(check[2 + 1]));
                System.out.println(bstobj.floor(deobj));
                break;
            case "ceiling":
                deobj = new BookDetails(check[1],
                    check[2], Float.parseFloat(check[2 + 1]));
                System.out.println(bstobj.ceiling(deobj));
                break;
            case "deleteMax":
                bstobj.deleteMax();
                break;
            case "deleteMin":
                bstobj.deleteMin();
                break;
            case "delete":
                deobj = new BookDetails(check[1], check[2],
                    Float.parseFloat(check[2 + 1]));
                bstobj.delete(deobj);
                break;
            default:
                break;
            }
        }
    }
}

