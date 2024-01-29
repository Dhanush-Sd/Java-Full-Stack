package Threads;

public class MultiThreadingUsingManyObject extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Good :"+i);
        }
    }

    public static void main(String[] args) {
        MultiThreadingUsingManyObject mt = new MultiThreadingUsingManyObject();
        MultiThreadingUsingManyObject mtu = new MultiThreadingUsingManyObject();
        MultiThreadingUsingManyObject mtum = new MultiThreadingUsingManyObject();
        MultiThreadingUsingManyObject mtumo = new MultiThreadingUsingManyObject();
        mt.start();;
        mtu.start();
        mtum.start();
        mtumo.start();
    }
}
