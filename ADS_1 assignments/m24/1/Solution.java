import java.util.Scanner;
class Student {
	private int rollNumber;
	private String name;
	private double marks;
	Student(int r, String n, double m) {
		this.rollNumber = r;
		this.name = n;
		this.marks= m;
	}
	public int getRollNumber() {
		return this.rollNumber;
	}

	public String getName() {
		return this.name;
	}

	public double getMarks() {
		return this.marks;
	}
	/*public String toString() {

	}*/
	public int compareTo(final Object object) {
        Student that = (Student) object;
        return this.name.compareTo(that.name);
    }

}

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
        private Student key;
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
        private Node(final Student key1, final int val1, final int s) {
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
    public int get(final Student key) {
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
    public void put(final Student key, final int val) {
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
    private Node put(final Node x, final Student key, final int val) {
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
    public Student min() {
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
    public Student max() {
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
    public Student floor(final Student key) {
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
    private Node floor(final Node x, final Student key) {
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
    public Student ceiling(final Student key) {
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
    private Node ceiling(final Node x, final Student key) {
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
     * @return     {Student Object}
     */
    public Student select(final int k) {
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
    public int rank(final Student key) {
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
    private int rank(final Student key, final Node x) {
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
}



class Solution{
	Solution() {

	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bstobj = new BinarySearchTree();
		int a = Integer.parseInt(sc.nextLine());
		while(a > 0) {
			String[] check = sc.nextLine().split(",");
			Student s = (new Student(Integer.parseInt(check[0]), (check[1]), Double.parseDouble(check[2])));
			a--;
		}
		int b = Integer.parseInt(sc.nextLine());
		while(b > 0) {
			String[] check = sc.nextLine().split(" ");
			b--;
		}
		
	}
}
