package Oops.ScannerClass;
import java.lang.StringBuffer;
import java.util.Scanner;
public class PalindromeWithStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String s1 = new String(sb);
        if (s.equals(s1)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not");
        }
    }
}
