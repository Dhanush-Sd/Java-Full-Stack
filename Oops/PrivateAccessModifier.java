package Oops;
class S1{
    private int a = 10;
    void m1(){
        System.out.println(a);
    }
}
public class PrivateAccessModifier extends S1{
    public static void main(String[] args) {
        PrivateAccessModifier p = new PrivateAccessModifier();
        p.m1();

    }


}
