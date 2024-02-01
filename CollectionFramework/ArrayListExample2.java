package CollectionFramework;
import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);//add() used to add objects to list
        al.add("Dhanush");
        al.add(false);
        al.add(null);
        al.add(30.20);
        al.add(45.6f);
        al.add(new ArrayListExample1());
        al.add(2,true);//to add object to specific index
        al.add("Dhanush");
        System.out.println(al);
        boolean b = al.contains("Dhanush");//returns boolean output of whether the given object is present or not
        System.out.println(b);
        Object o = al.get(1);//to get the object of specific index
        System.out.println(o);
        int k = al.indexOf("Dhanush");//to find index of object
        System.out.println(k);
        int x = al.lastIndexOf("Dhanush");//to get the last occurence of the given object
        System.out.println(x);
        Object a = al.remove(7);//to remove specific object
        System.out.println(al);
        al.set(3,"Raman");//to set specific object at specific index
        System.out.println(al);
        int j = al.size();//to get the size of arraylist
        System.out.println(j);
        Object[] c = al.toArray();//to convert arraylist to array
        System.out.println("Elements are in separate order");
        for(int i = 0;i<j;i++){//to print array elements one by one
            System.out.println(c[i]);
        }
        al.clear();//to delete all object
        System.out.println(al);


    }
}
