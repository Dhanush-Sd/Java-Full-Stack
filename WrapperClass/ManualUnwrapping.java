package WrapperClass;

public class ManualUnwrapping {
    public static void main(String[] args) {
        Integer i = new Integer(20);
        Integer j = new Integer(30);
        int a = i.intValue();
        int b = j.intValue();
        int c = a + b;
        System.out.println(c);
    }
}
