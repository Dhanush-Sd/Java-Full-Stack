package Java_Syntax;

public class MethodCreation {
    void m1()//method creation
    {
        int a = 10;
        System.out.println(a);
        System.out.println("Method creation");
    }

    public static void main(String[] args) {
        MethodCreation m = new MethodCreation();
        m.m1();//calling the method with object
    }
}
