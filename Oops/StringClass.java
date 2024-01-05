package Oops;
import java.lang.String;
public class StringClass {
    public static void main(String[] args) {
        String s = "Dhanush";
        int k = s.length();
        char h[] = new char[k];//array declaration in java
        for(int i = 0;i < k; i++)//to loop through string
        {
            char x = s.charAt(i);
            h[i] = x;
        }
        System.out.println(h);

    }

}
