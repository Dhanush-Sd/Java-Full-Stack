package CollectionFramework;
import java.util.HashSet;
import java.util.Iterator;

public class PrintAllElementsSeparateInHashSet {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add("Dhanush");
        h.add(false);
        h.add(null);
        h.add(30.20);
        h.add(45.6f);
        h.add(new PrintAllElementsSeparateInHashSet());
        System.out.println(h);
        Iterator i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
