package Oops.Polymorphism;

public class MethodOverloading {
    void m1(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    void m1(float a, float b){
        float c = a+b;
        System.out.println(c);
    }
    void m1(String a,String b){
        String c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.m1(10,20);
        m.m1(2.5f, 3.5f);
        m.m1("Well", "Done");
    }
}
