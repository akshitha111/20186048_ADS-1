import java.util.*;

class AddLargeNumbers {
  
    public static LinkedList numberToDigits(String number) {
            LinkedList one = new LinkedList(Arrays.asList(number));
            Iterator iterator = one.iterator();
            while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        } return one;
    }

    /*public static String digitsToNumber(LinkedList list) {
        return;
    }*/

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        
            LinkedList a = list1;
            LinkedList b = list2;
            LinkedList c;
            int sum = 0;
            int carry;
            for(int i = list1.size(); i > 0; i--) {
                for(int j = list2.size(); j > 0; j--) {
                   sum += (j + i);
                   if(sum > 10) {
                    sum = sum % 10;
                        
                    }//c = sum;
                     
                   }

                }return b;
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
                /*System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));*/
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                //System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
