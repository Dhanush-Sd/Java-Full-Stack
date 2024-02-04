package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Harish");
        a.add("Dhanush");
        a.add("Abinash");
        a.add("Bala");
        a.add("Aakash");
        a.add("Hudsa");
        a.add("Hari");
        a.add("Karthi");
        a.add("Jeeva");
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
    }
}
