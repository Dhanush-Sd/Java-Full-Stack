package Threads;
class New{
    void m1(){
        System.out.println("wow");
    }
}
public class RunnableInterface extends New implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Good: "+i);
        }
    }

    public static void main(String[] args) {
        RunnableInterface r = new RunnableInterface();
        RunnableInterface ri = new RunnableInterface();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(ri);
        t1.start();
        t2.start();
        r.m1();
        ri.m1();
    }
}
