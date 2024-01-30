package Threads;

public class JoinAndSleep extends Thread{
    public void run() {
        for(int i = 1;i<=5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Good "+i);
        }
    }

    public static void main(String[] args) {
        JoinAndSleep j = new JoinAndSleep();
        JoinAndSleep ja = new JoinAndSleep();
        JoinAndSleep jas = new JoinAndSleep();
        j.start();
        try{
            j.join(2500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        ja.start();
        jas.start();
    }
}
