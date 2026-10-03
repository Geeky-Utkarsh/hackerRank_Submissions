import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        scan.nextLine(); // consume that "\\n"  present in the buffer , which was left by the scan.nextInt();
        
        Double d = scan.nextDouble();
        
        scan.nextLine(); // even scan.nextDouble() also leaves "\n" in the Buffer . Just like  nextInt();
        String s = scan.nextLine();
        
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        
        scan.close();
    }
}
