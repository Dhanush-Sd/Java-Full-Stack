package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListInSequence {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("Dhanush");
        a.add(false);
        a.add(null);
        a.add(30.20);
        a.add(45.6f);
        a.add(new PrintArrayListInSequence());
        a.add(2,true);
        a.add("Dhanush");
        System.out.println(a);
        Iterator i = a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

