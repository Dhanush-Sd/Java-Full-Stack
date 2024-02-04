package CollectionFramework;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet l = new LinkedHashSet();
        l.add(10);
        l.add("Dhanush");
        l.add(false);
        l.add(null);
        l.add(30.20);
        l.add(45.6f);
        l.add(new LinkedHashSetExample());
        l.add("Dhanush");//does not allow duplicate values
        System.out.println(l);
        Iterator i = l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
