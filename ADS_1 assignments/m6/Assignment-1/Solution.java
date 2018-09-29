import java.util.Scanner;
import java.util.*;
class AddLargeNumbers {

    //public class LinkedList {
        //LinkedList() {
           // LinkedList linkedList = new LinkedList();
        //}
    //}

    
    
    public static LinkedList numberToDigits(String number) {
        for(int i = 0; i < number.length(); i++) {

        }return null;
        
            


    }


    public static String digitsToNumber(LinkedList list) {
        return null;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        /*LinkedList one = list1;
        LinkedList two = list2;
        LinkedList a = new LinkedList();*/
        /*int carry = 0;
        int temp = null;
        int sum;
*/
        //while(one !=null || two != null)
        //sum = 
        //
return null;
        }
    //}


}

class LinkedList {
    private Node head;
    private class Node {
        private char item;
        private Node next;
    }
    LinkedList() {
        this.head = null;
    LinkedList pDigits= new LinkedList();
}
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
