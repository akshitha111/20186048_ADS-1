import java.util.Scanner;
/**
 * Class for linear probing hashing.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
class LinearProbingHashing<Key, Value> {
    /**
     * capacity of the linear array.
     */
    static final int CAPACITY = 4;
    /**
     * number of key value pairs.
     */
    private int n;
    /**
     * size of linear probing array.
     */
    private int m;
    /**
     * array of keys - key type.
     */
    private Key[] keys;
    /**
     * array of values - value type.
     */
    private Value[] values;

    /**
     * overloaded constructor.
     */

    LinearProbingHashing() {
        this(CAPACITY);
    }

    /**
     * constructor.
     *
     * @param      capa  The capacity
     */

    LinearProbingHashing(final int capa) {
        m = capa;
        n = 0;
        keys = (Key[])   new Object[m];
        values = (Value[]) new Object[m];
    }
    /**
     * size of the array.
     * The time complexity 1.
     *
     * @return     { returns size }
     */

    public int size() {
        return n;
    }
    /**
     * checks if empty or not.
     * The time complexity 1.
     *
     *
     * @return     True if empty, False otherwise.
     */

    public boolean isEmpty() {
        return size() == 0;
    }
    /**
     * checks if there is key in array or not.
     * The time complexity N.
     *
     *
     * @param      key   The key
     *
     * @return     { returns true or false }
     */

    public boolean contains(final Key key) {
        return get(key) != null;
    }

    /**
     * finds hash code of the key.
     * The time complexity N.
     *
     *
     * @param      key   The key.
     *
     * @return     { returns hash code }
     */

    private int hash(final Key key) {
        final int ele = 11;
        final int x = 0x7fffffff;
        return (key.hashCode() * ele) % m;
    }

    /**
     * resizes the array.
     * The time complexity N.
     *
     *
     * @param      c  The capacity
     */

    private void resize(final int c) {
        LinearProbingHashing<Key, Value> temp = new
        LinearProbingHashing<Key, Value>(c);
        for (int i = 0; i < m; i++) {
            if (keys[i] != null) {
                temp.put(keys[i], values[i]);
            }
        }
        keys = temp.keys;
        values = temp.values;
        m    = temp.m;
    }

    /**
     * inserts value in array.
     * The time complexity N.
     *
     *
     * @param      key   The key
     * @param      val   The value
     */

    public void put(final Key key, final Value val) {
        if (val == null) {
            delete(key);
            return;
        }
        if (n >= m / 2) {
             resize(2 * m);
        }

        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % m) {
            if (keys[i].equals(key)) {
                values[i] = val;
                return;
            }
        }
        keys[i] = key;
        values[i] = val;
        n++;
    }
    /**
     * gets the value of the key.
     * The time complexity N.
     *
     *
     * @param      key   The key
     *
     * @return     { returns value }
     */

    public Value get(final Key key) {

        for (int i = hash(key); keys[i] != null; i = (i + 1) % m) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }

        return null;
    }
    /**
     * deletes the key value pair.
     * The time complexity N.
     *
     *
     * @param      key   The key
     */

    public void delete(final Key key) {

        if (!contains(key)) {
            return;
        }

        // find position i of key
        int i = hash(key);
        while (!key.equals(keys[i])) {
            i = (i + 1) % m;
        }

        // delete key and associated value
        keys[i] = null;
        values[i] = null;

        // rehash all keys in same cluster
        i = (i + 1) % m;
        while (keys[i] != null) {
            // delete keys[i] an vals[i] and reinsert
            Key   keyToRehash = keys[i];
            Value valToRehash = values[i];
            keys[i] = null;
            values[i] = null;
            n--;
            put(keyToRehash, valToRehash);
            i = (i + 1) % m;
        }

        n--;
        // halves size of array if it's 12.5% full or less
        final int eight = 8;
        if (n > 0 && n <= m / eight) {
            resize(m / 2);
        }
    }
    /**
     * displays the key value pair.
     * The time complexity N.
     *
     */

    public void display() {
        if (n == 0) {
            System.out.println("{}");
            return;
        }
        String str = "{";
        for (int i = 0; i < m; i++) {
            if (keys[i] != null) {
                str += keys[i] + ":" + values[i] + ", ";
            }
        }
        String a = str.substring(0, str.length() - 2);
        a = a + "}";
        System.out.println(a);
    }
}

/**
 * this is a solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * reads input.
     * Creates object for linearProbingHashing class.
     * The time complexity N.
     *
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        LinearProbingHashing<String, Integer> lpt = new 
        LinearProbingHashing<String, Integer>();
        int lines = Integer.parseInt(input.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] tokens = input.nextLine().split(" ");
            switch (tokens[0]) {
                case "put":
                lpt.put(tokens[1], Integer.parseInt(tokens[2]));
                break;
                case "display":
                lpt.display();
                break;
                case "delete":
                lpt.delete(tokens[1]);
                break;
                case "get":
                System.out.println(lpt.get(tokens[1]));
                break;
                default:
                break;

            }
        }
    }
}
