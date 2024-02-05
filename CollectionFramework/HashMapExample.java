package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Dhanush");
        hm.put(2,"Abinash");
        hm.put(3,"Bala");
        hm.put(4,"Aakash");
        hm.put(1,"Hudsa");//new value will replace the old value
        System.out.println(hm);
        System.out.println(hm.entrySet());
        hm.remove(4);
        System.out.println(hm);
        HashMap<Integer,String> h = new HashMap<Integer,String>();
        h.putAll(hm);
        System.out.println(h);
        h.put(4,"Aakash");
        System.out.println(h);

    }

}
