package Oops;

public class StringMethods {
    public static void main(String[] args) {

        //concatenation
        String s = "Dhanush";
        String s1 = "SD";
        String s2 = s1.concat(s);
        System.out.println(s2);
        String s3 = s+s1;
        System.out.println(s3);
        //equals()
        String s4 = "Dhanush";
        boolean s5 = s4.equals(s);
        System.out.println(s5);
        //replace()
        String s6 = s4.replace('a','u');
        System.out.println(s6);
        //split()
        String s7 = "he is a good man";
        System.out.println(s7);
        String y[] = s7.split(" ");
        for(int i = 0;i<y.length;i++){
            System.out.println(y[i]);
        }
        //toUpperCase() and toLowerCase()
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        //toCharArray()
        char z[] = s4.toCharArray();
        for(int i = 0;i<z.length;i++){
            System.out.println(z[i]);
        }
        //valueof()
        char a[] = new char[2];
        a[0]='s';
        a[1]='d';
        System.out.println(String.valueOf(a));
        int x = 10;
        System.out.println(String.valueOf(x));
        //substring()//works like slicing operator
        System.out.println(s.substring(2));
        System.out.println(s.substring(1,4));
    }
}

