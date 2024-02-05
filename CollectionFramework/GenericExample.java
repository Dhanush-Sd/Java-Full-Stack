package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);//add() used to add objects to list
        a.add(30);
        a.add(50);
        a.add(10);
        a.add(40);
        Collections.sort(a);
        System.out.println(a);
    }
}
