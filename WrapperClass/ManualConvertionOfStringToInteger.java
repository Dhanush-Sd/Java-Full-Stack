package WrapperClass;

public class ManualConvertionOfStringToInteger {
    public static void main(String[] args) {
        String a = "10";
        String b = "20";
        String c = a+b;
        System.out.println(c);
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        int k = i + j;
        System.out.println(k);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
