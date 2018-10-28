import java.util.Scanner;
class Solution {
    Solution() {

    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SeparateChainingHashST<Integer, String> hash1 = new SeparateChainingHashST();
        SeparateChainingHashST<Integer, Double> hash2 = new SeparateChainingHashST();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0) {
            String[] tokens = sc.nextLine().split(",");
            hash1.put(Integer.parseInt(tokens[0]), tokens[1]);
            hash2.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[2]));
        }
        int a = Integer.parseInt(sc.nextLine());
        while(a-- != 0) {
            String[] check = sc.nextLine().split(" ");
            if(check[0].equals("get") && Integer.parseInt(check[2]) == 1) {
                if(hash1.get(Integer.parseInt(check[1])) == null) {
                System.out.println("Student does not exist...");
            }
            else {
                System.out.println(hash1.get(Integer.parseInt(check[1])));                
            }
            }
            else if(check[0].equals("get") && Integer.parseInt(check[2]) == 1) {
                if(hash2.get(Integer.parseInt(check[1])) == (null)) {
                System.out.println("Student does not exist...");
            }
            else{
                System.out.println(hash2.get(Integer.parseInt(check[2])));
            }

        }
    }
}
}