package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class AdvancedForLoopinHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Raja");
        hm.put(2,"Ramu");
        hm.put(3,"Bala");
        hm.put(4,"Tamil");
        hm.put(5,"Sankar");        hm.put(6,"Prabhu");
        System.out.println(hm);
        System.out.println(hm.entrySet());
        for (Map.Entry k:hm.entrySet()){
            System.out.println(k.getKey()+" "+k.getValue());
        }
    }
}
