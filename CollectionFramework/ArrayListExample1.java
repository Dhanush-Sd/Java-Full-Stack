package CollectionFramework;
import java.util.ArrayList;
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);//add() used to add objects to list
        a.add("Dhanush");
        a.add(false);
        a.add(30.20);
        a.add(45.6f);
        a.add(new ArrayListExample1());//when object reference is sent it returns classname with @hashcode
        System.out.println(a);
    }
}
