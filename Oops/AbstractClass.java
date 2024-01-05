package Oops;
abstract class Raja{
    abstract void m1();
}
public class AbstractClass extends Raja {
    void m1(){
        System.out.println("abstract method overriding");
    }
    public static void main(String[] args) {
        AbstractClass a = new AbstractClass();
        a.m1();

    }

}
