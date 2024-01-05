package Java_Syntax;

public class WideningProcess {
    void m1(int a){
        System.out.println("Integer");
    }
    void m1(long b){
        System.out.println("Long");
    }
    void m1(float c){
        System.out.println("Float");
    }

    public static void main(String[] args) {
        WideningProcess w = new WideningProcess();
        w.m1(25.5f);//it automatically chooses based on input
    }
}
