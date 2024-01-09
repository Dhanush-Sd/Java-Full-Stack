package WrapperClass;
class Ramu extends Object{
    int y;
    void m1(){
        System.out.println("good");
    }
    public String toString(){
        return ""+y;
    }
    Ramu(int a){
        y = a;
    }
}
public class WrapperClassExampleCorrected {
    public static void main(String[] args) {
        Integer i = new Integer(35);
        System.out.println(i);//35
        Ramu r = new Ramu(45);
        System.out.println(r);//WrapperClass.Raja@5f184fc6
        //To overcome this check WrapperClassExampleCorrected.java file
    }
}
