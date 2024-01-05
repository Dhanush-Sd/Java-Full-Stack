package Oops;
interface Aa {
    void m1();//public abstract will be default
}
interface Bb{
    void m2();
}
interface Cc extends Bb{//to inherit from one interface to other extends is used
    void m3();
}
//But to inherit interface to class,implements is used
public class MultipleInheritanceUsingInterface implements Cc, Aa {//implementing 2 interfaces at a time,it is multiple inheritance
    public void m1()
    {
        System.out.println("good");
    }
    public void m2(){
        System.out.println("well");
    }
    public void m3(){
        System.out.println("Nice");
    }

    public static void main(String[] args) {
        MultipleInheritanceUsingInterface m = new MultipleInheritanceUsingInterface();
        m.m1();
        m.m2();
        m.m3();
    }
}
