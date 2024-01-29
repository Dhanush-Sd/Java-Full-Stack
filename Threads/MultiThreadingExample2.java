package Threads;

public class MultiThreadingExample2 extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            Thread t = Thread.currentThread();
            String x = t.getName();
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MultiThreadingExample2 m = new MultiThreadingExample2();
        MultiThreadingExample2 mt = new MultiThreadingExample2();
        MultiThreadingExample2 mte = new MultiThreadingExample2();
        m.setName("Thread 1");
        mt.setName("Thread 2");
        mte.setName("Thread 3");
        m.start();
        mt.start();
        mte.start();
    }
}
