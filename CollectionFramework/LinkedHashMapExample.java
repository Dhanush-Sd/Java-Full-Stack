package CollectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap l = new LinkedHashMap();
        l.put("Dhanush",1);
        l.put("Abinash",2);
        l.put("Bala",3);
        l.put("Aakash",4);
        l.put(null,5);
        System.out.println(l);
    }
}
