package Oops.ExceptionHandling;

public class NullPointerExceptionExample {
    int a = 45;

    public static void main(String[] args) {
        NullPointerExceptionExample n = new NullPointerExceptionExample();
        System.out.println(n.a);
        n = null;
        try{
            System.out.println(n.a);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Good");
    }
}
