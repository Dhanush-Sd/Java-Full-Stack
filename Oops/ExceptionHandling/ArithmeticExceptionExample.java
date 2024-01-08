package Oops.ExceptionHandling;
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        System.out.println("good");
        try{
            int k = 35/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("nice");
    }
}
