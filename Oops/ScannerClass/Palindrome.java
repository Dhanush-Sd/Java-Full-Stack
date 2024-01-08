package Oops.ScannerClass;
import java.util.Scanner;
//A palindrome program without StringBuffer
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();//gets string as a input from user
        char x[] = s1.toCharArray();//converts string to char array
        int i = 0;
        int j = (x.length)-1;
        //to reverse the char array
        while(i<j){
            char d = x[i];
            x[i] = x[j];
            x[j] = d;
            i++;
            j--;
        }
        System.out.println(x);
        String s2 = new String(x);//String constructor converts char array to stiong
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
