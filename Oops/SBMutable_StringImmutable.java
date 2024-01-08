package Oops;

public class SBMutable_StringImmutable {
    public static void main(String[] args) {
        //String Buffer is mutable
        StringBuffer sb = new StringBuffer("Dhanush");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);// it shows string buffer is mutable
        //String is immutable
        String s = "Partha";
        System.out.println(s);
        s.concat("Sarathy");
        System.out.println(s);//this line prints partha only and it shows String is immutable
    }
}
