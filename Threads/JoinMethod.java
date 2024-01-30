package Threads;

public class JoinMethod extends Thread{
    @Override
    public void run() {
        for(int i = 1;i<5;i++){
            System.out.println("Good "+i);
        }
    }
    public static void main(String[] args) {
        JoinMethod j = new JoinMethod();
        JoinMethod jm = new JoinMethod();
        JoinMethod jm1 = new JoinMethod();
        j.start();
        try{
            j.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        jm.start();
        jm1.start();
    }
}
