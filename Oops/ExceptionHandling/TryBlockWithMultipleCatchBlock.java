package Oops.ExceptionHandling;

public class TryBlockWithMultipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("good");
        try{
            int k = 35/0;
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e){// exception is the parent od all exceptions, so must be at last catch block
            System.out.println(e);
        }
    }
}
