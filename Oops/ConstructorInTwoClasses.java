package Oops;
class Ramu{
    int a = 40;
    public Ramu(){
        super();
        System.out.println(a);
    }
}
public class ConstructorInTwoClasses extends Ramu {
    int b = 50;
    public ConstructorInTwoClasses(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        ConstructorInTwoClasses c = new ConstructorInTwoClasses();
        System.out.println(c.a);
        System.out.println(c.b);

    }

}
