package CollectionFramework;
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add("Dhanush");
        l.add(false);
        l.add(null);
        l.add(30.20);
        l.add(45.6f);
        l.add(new LinkedListExample1());
        l.add(2,true);
        l.add("Dhanush");
        System.out.println(l);
        l.addFirst("partha");//to add object at first
        System.out.println(l);
        l.addLast("Tamil");//to add object at last
        System.out.println(l);
        Object o = l.getFirst();//to get the first object
        String s = (String)o;
        System.out.println(s);
        l.offer("Nagu");//to add object at last
        System.out.println(l);
        Object k = l.peek();//to get the first object
        System.out.println(k);
        Object u = l.peekFirst();//to get the first object
        System.out.println(u);
        Object d = l.peekLast();//to get the last object
        System.out.println(d);
        Object a = l.poll();//to remove the first object
        System.out.println(a);
        System.out.println(l);
        Object t = l.removeFirst();//to remove the first object
        System.out.println(t);
        System.out.println(l);
        Object c = l.removeLast();//to remove the last object
        System.out.println(c);
        System.out.println(l);
        Object e = l.removeFirstOccurrence("Dhanush");//to remove the first occurence object
        System.out.println(l);
    }
}
