package Oops.ExceptionHandling;

public class TryCatchExample{
    public static void main(String[] args) {
        System.out.println("good");
        int a = 35;
        for (int i = -3; i<4; i++){
            int k = 0;
            try{
                k = a/i;
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(k);
        }
    }
}
