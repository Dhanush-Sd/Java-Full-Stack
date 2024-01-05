package Oops;
interface sample{
    int a = 10;//public static final will be default
}
public class Interface implements sample{//implements is used for inheriting interface

    public static void main(String[] args) {
        Interface i = new Interface();
        System.out.println(i.a);
    }

}
