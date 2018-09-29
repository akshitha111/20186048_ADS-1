import java.util.Scanner;
import java.util.*;
import java.util.iterator;
class AddLargeNumbers {

    //public class LinkedList {
        //LinkedList() {
           // LinkedList linkedList = new LinkedList();
        //}
    //}

    
    
    public static LinkedList numberToDigits(String number) {
        
            //LinkedList one = new LinkedList();
            LinkedList ll = new LinkedList(Arrays.asList(number));
            Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            // Print element to console
            System.out.println((String) iterator.next());
            
        return ll;

        }
        
            


    


    public static String digitsToNumber(LinkedList list) {
        return null;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        int sum = 0;
        int carry = 0;
        int data;
        LinkedList pDigits= new LinkedList();
        
    class LinkedList {
    Node head;
    class Node {
        private char item;
        private Node next;
        int data;
    }
    LinkedList() {
        this.head = null;
        int data;
    LinkedList pDigits= new LinkedList();
}


        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;
    }
        while(list1 != null || list2 != null) {

            
        }return pDigits;

        }
    
    //}


}


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
