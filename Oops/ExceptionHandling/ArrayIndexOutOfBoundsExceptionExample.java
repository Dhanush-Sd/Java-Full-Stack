package Oops.ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int k = a.length;
        for(int i = 0;i<k;i++){
            System.out.println(a[i]);
        }
        try{
            System.out.println(a[k]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Good");
    }
}
