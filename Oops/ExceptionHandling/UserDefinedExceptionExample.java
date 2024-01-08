package Oops.ExceptionHandling;

public class UserDefinedExceptionExample {
    void display(int age){
        if(age<18){
            throw new ArithmeticException("u r not eligible for voting");
        }
        else{
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        UserDefinedExceptionExample u = new UserDefinedExceptionExample();
        u.display(17);
    }
}
