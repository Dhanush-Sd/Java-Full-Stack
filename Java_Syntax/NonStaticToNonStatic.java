package Java_Syntax;

public class NonStaticToNonStatic {
    void m1(){//static
        System.out.println("Hello");
    }
    void m2(){//static
        m1();//calling m1() without object due to nonstatic to nonstatic
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        NonStaticToNonStatic n = new NonStaticToNonStatic();
        n.m2();
        System.out.println("Good");
    }
}
