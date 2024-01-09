package WrapperClass;

public class IntegerConstructorWithStringParameter {
    public static void main(String[] args) {
        String a = "10";
        String b = "20";
        String c = a+b;
        System.out.println(c);
        Integer i = new Integer(a);
        Integer j = new Integer(b);
        int k = i + j;
        System.out.println(k);
    }
}
