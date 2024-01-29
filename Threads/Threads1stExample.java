package Threads;

public class Threads1stExample extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Good :"+i);
        }
    }

    public static void main(String[] args) {
        Threads1stExample te = new Threads1stExample();
        te.start();
    }
}
