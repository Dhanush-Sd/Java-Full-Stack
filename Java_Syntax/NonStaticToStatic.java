package Java_Syntax;

public class NonStaticToStatic {
    public static void m1(){//static
        System.out.println("Hello");
    }
    void m2(){//non static
        m1();//calling m1() without object due to nonstatic to static
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        NonStaticToStatic n = new NonStaticToStatic();
        n.m2();
        System.out.println("Good");
    }
}
