package Oops.ExceptionHandling;

public class StringIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        String s = "dhanush";
        for(int i = 0;i <= s.length(); i++){
            try{
                System.out.println(s.charAt(i));
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        System.out.println("good");
    }

}
