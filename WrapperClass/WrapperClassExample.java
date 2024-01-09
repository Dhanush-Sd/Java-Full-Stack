package WrapperClass;
class Raja{
    void m1(){
        System.out.println("good");
    }
    Raja(int a){

    }
}
public class WrapperClassExample {
    public static void main(String[] args) {
        Integer i = new Integer(35);
        System.out.println(i);//35
        Raja r = new Raja(45);
        System.out.println(r);//WrapperClass.Raja@5f184fc6
        //To overcome this check WrapperClassExampleCorrected.java file
    }
}
