package Java_Syntax;

public class StaticToStatic {
    static float a = 12.5f;//static variable
    static int m1()//static method
    {
        int b = 10;
        System.out.println("Hello");
        return b;
    }

    public static void main(String[] args) {//static method
        System.out.println(a);
        System.out.println(m1());
    }
}
