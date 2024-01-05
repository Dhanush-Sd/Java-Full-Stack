package Oops.Polymorphism;
class Parent{
    void m1(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}
public class MethodOverriding extends Parent {
     void m1(int a,int b){
        int c = a*b;
        System.out.println(c);
        super.m1(10,20);//call super class m1()
    }

    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.m1(10,20);
    }
}
