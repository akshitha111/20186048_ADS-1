import java.util.Scanner;
class Node {
	private int value;
	private Node friend;

	Node(int v, Node f) {
		this.value = v;
		this.friend= f;
	}

	public void setFriend(final Node f) {
		this.friend = f;
	}

	public void setValue(int v) {
		this.value = v;
	}

	public int getValue() {
		return this.value;
	}

	public Node getFriend() {
		return this.friend;
	}

	public String toString() {
		return value + "";
	}
}

class Steque {
private Node head, tail;
private int size;
//time complexity of steque is 1
	Steque() {
	head = tail = null;
	size = 0;
	}

//inserts element at first of list.
//time complexity for push() is 1.
public void push(int value) {
	Node old = head;
	head = new Node(value, old);
	if(old==null)
		tail = head;
		size++;
}

//remove element at beginning of the list
//time complexity for pop() is 1.
public void pop() {
	if(head != null && tail !=null){
		if(head.getFriend() == null && tail.getFriend() == null) {
			tail = head = null;
			size--;
	}
	else if(head!=null) {
		head = head.getFriend();
		size--;
	}
}
}

//inserts element at end of list.
//time complexity is 1.
public void enqueue(int value) {
	if (tail == null && head == null) {
			head = tail = new Node(value, null);
		} else if (tail != null) {
			Node oldtail = tail;
			tail = new Node(value, null);
			oldtail.setFriend(tail);
		}
		size++;
	}

//timecomplexity for tostring() is n
//n is the size of the list
public String toString() {
	StringBuffer sb = new StringBuffer("");
	if(size == 0) {
	sb.append("Steque is empty.");
	return sb.toString();
	} else {
	Node temp = head;
	while (temp != null) {
		sb.append(temp + ", ");
		temp = temp.getFriend();
	}
	
}return sb.toString().substring(0, sb.length() - 2);
}
}
class Solution {

	private Solution() {
		//unused constructor.

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n > 0) {
			Steque st = new Steque();
				while(sc.hasNext()) {
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
			}n--;
		}
	}
}