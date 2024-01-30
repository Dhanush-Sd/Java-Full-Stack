package Threads;
class Ravi{
    void multiply(int n){
        synchronized (this){
            Thread t = Thread.currentThread();
            String h = t.getName();
            System.out.println(h);
            for(int i = 1;i<=5;i++){
                System.out.println(n*i);
            }
        }
    }
}
class Tamilan extends Thread{
    Ravi r;
    Tamilan(Ravi r){
        this.r = r;
    }
    public void run() {
        r.multiply(5);
    }
}
class Raman extends Thread{
    Ravi r;
    Raman(Ravi r){
        this.r = r;
    }
    public void run() {
        r.multiply(100);
    }
}
public class SynchronizedMethodExample2 {
    public static void main(String[] args) {
        Ravi x = new Ravi();
        Tamilan t = new Tamilan(x);
        Raman r = new Raman(x);
        t.setName("Tamilan");
        r.setName("Raman");
        t.start();
        r.start();
    }
}
