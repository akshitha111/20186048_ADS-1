import java.util.*;
/**
 * this is a Class for node.
 */
class Node{
	String valueue;
	Node next;
	Node(String v) {
		this.valueue=v;
	}
}
/**
 * this is a LinkedList class.
 */
class LinkedList {
	private Node head;
	private int size;
	LinkedList() {
		head = null;
		size =0;
	}
	/**
	 * { insertAt function with two parameters }
	 *
	 * @param      position   The int position
	 * @param      value      The String value
	 *
	 * @throws     Exception  { if there is invalid index }
	 */
	public void insertAt(int position, String value)throws Exception{
		if (position < 0 || position > size) {
		throw new Exception();			
		}
		Node obj = new Node(value);
		head=insertAt(position,head,obj,0);
	}
	/**
	 * { insertAt function with 4 parameters }
	 *
	 * @param      position   The int position
	 * @param      first      The Node first
	 * @param      obj        The Node object
	 * @param      count      The int count
	 *
	 * @return     { description_of_the_return_valueue }
	 *
	 * @throws     Exception  { if there is invalid index }
	 */
	public Node insertAt(int position, Node first, Node obj, int count) throws Exception{
		if (position == count) {
			obj.next =first;
			size++;
			return obj;
		}
		first.next = insertAt(position,first.next,obj,count+1);
		return first;
	}
	/**
	 * { this is a function for reverse }
	 */
	public void reverse(){
		reverse(null,head);
	}
	/**
	 * { this is a function for reverse }
	 *
	 * @param      previous  The previous
	 * @param      current   The current
	 */
	public void reverse(Node previous, Node current){
		if (current!=null) {
			reverse(current,current.next);
			current.next= previous;
		}else {
			head =previous;
		}
	}
	/**
	 * { this is a function for show }
	 */
	public void show(){
		Node temp = head;
		String str = "";
		while(temp!=null){
			str += temp.valueue+ ", ";
			temp = temp.next;
		}
		System.out.println(str.substring(0, str.length()-2));

	}
	}
	
	/**
	 * this is a class for solution.
	 */
class Solution {
	/**
	 * default constructor
	 */
	private Solution() {
		//unused constructor
	}
	/**
	 * Client program
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while(s.hasNextLine()) {
			String[] tokens = s.nextLine().split(" ");
			switch (tokens[0]) {
				case "insertAt" :
				try {
				ll.insertAt(Integer.parseInt(tokens[1]),tokens[2]);
				ll.show();}
				catch (Exception e) {
					System.out.println("Can't insert at this position.");
				}
				break;
				case "reverse" : 
				try{
				ll.reverse();
				ll.show();
				}
				catch(Exception e) {
				System.out.println("No elements to reverse.");
				}
				break;
			}
		}
	}

}



