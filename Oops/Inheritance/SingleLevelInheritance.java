package Oops.Inheritance;
class C1{
    void m1(){
        System.out.println("hello");
    }
}
public class SingleLevelInheritance extends C1{
    void m2()
    {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        SingleLevelInheritance s = new SingleLevelInheritance();
        s.m1();
        s.m2();
    }
}
