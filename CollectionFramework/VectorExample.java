package CollectionFramework;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        int k = v.capacity();//to show the capacity of the vector
        System.out.println(k);
        v.add(10);
        v.add("Dhanush");
        v.add(false);
        v.add(null);
        v.add(30.20);
        v.add(45.6f);
        v.add(new VectorExample());
        v.add(2,true);
        v.add("Dhanush");
        System.out.println(v);
        Enumeration e = v.elements();//to enumerate vector values one by one
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
