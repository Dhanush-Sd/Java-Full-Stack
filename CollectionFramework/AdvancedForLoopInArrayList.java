package CollectionFramework;

import java.util.ArrayList;

public class AdvancedForLoopInArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Raja");
        al.add("Venkat");
        al.add("Bala");
        al.add("Tamil");
        for(String k : al){
            System.out.println(k);
        }
    }
}
