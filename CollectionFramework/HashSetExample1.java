package CollectionFramework;
import java.util.HashSet;
public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add("Dhanush");
        h.add(false);
        h.add(null);
        h.add(30.20);
        h.add(45.6f);
        h.add(new HashSetExample1());
        h.add("Dhanush");//Hashset not allows duplicate values
        System.out.println(h);
        h.remove(30.20);
        System.out.println(h);
        boolean b = h.contains("Dhanush");
        System.out.println(b);
        h.clear();
        System.out.println(h);

        //displays values according to its hashcode
    }
}
