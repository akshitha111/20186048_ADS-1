import java.util.*;
class Node{
	String valueue;
	Node next;
	Node(String v) {
		this.valueue=v;
	}
}
class LinkedList {
	private Node head;
	private int size;
	LinkedList() {
		head = null;
		size =0;
	}
	public void insertAt(int position, String value)throws Exception{
		if (position<0 || position>size) {
		throw new Exception();			
		}
		Node obj = new Node(value);
		head=insertAt(position,head,obj,0);
	}
	/**
	 * { function_description }
	 *
	 * @param      position        The positionition
	 * @param      first      The first
	 * @param      obj        The object
	 * @param      count      The count
	 *
	 * @return     { description_of_the_return_valueue }
	 *
	 * @throws     Exception  { exception_description }
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
	public void reverse(){
		reverse(null,head);
	}
	public void reverse(Node previous, Node current){
		if (current!=null) {
			reverse(current,current.next);
			current.next= previous;
		}else {
			head =previous;
		}
	}
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
	
class Solution {
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



