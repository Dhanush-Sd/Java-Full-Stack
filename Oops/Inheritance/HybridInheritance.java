package Oops.Inheritance;
class Grandpa{
    void m1(){
        System.out.println("grandpa class");
    }
}
class Father extends Grandpa{//single inheritance
    void m2(){
        System.out.println("father class");
    }
}
class Son extends Father{ //multilevel inheritance
    void m3(){
        System.out.println("son class");
    }
}
public class HybridInheritance extends Father{//multilevel inheritance
    void m4(){
        System.out.println("Daughter class");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.m3();
        s.m2();
        s.m1();
        HybridInheritance m = new HybridInheritance();
        m.m4();
        m.m2();
        m.m1();
    }
}
