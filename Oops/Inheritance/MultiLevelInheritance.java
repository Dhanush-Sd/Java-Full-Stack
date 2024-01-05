package Oops.Inheritance;
class S1{
    void m1(){
        System.out.println("hi");
    }
}
class S2 extends S1{
    void m2(){
        System.out.println("hello");
    }
}
public class MultiLevelInheritance extends S2{
    public static void main(String[] args) {
        MultiLevelInheritance m = new MultiLevelInheritance();
        m.m1();
        m.m2();
    }

}
