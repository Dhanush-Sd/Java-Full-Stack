package Oops;

public class UserdefinedConstructor {
    int k = 40;
    public UserdefinedConstructor(){
        System.out.println(k);//super() is automatically given by compiler
    }

    public static void main(String[] args) {
        UserdefinedConstructor u = new UserdefinedConstructor();//it automatically calls the constructor
    }
}
