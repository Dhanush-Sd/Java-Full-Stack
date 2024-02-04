package CollectionFramework;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("Harish");
        t.add("Dhanush");
        t.add("Abinash");
        t.add("Bala");
        t.add("Aakash");
        t.add("Hudsa");
        t.add("Hari");
        t.add("Karthi");
        t.add("Jeeva");
        System.out.println(t);
        Iterator i = t.descendingIterator();//to get objects in descending order
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(t.first());
        System.out.println(t.pollFirst());
        System.out.println(t);
        SortedSet s = t.headSet("Hudsa");
        System.out.println(s);
        SortedSet ss = t.tailSet("Hudsa");
        System.out.println(ss);
        SortedSet ss1 = t.subSet("Bala","Hudsa");
        System.out.println(ss1);

    }
}
