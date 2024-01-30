package Threads;
class Raja{
    void multiply(int n){
        synchronized (this){
            for(int i = 1;i<=5;i++){
                System.out.println(n*i);
            }
        }
    }
}
class Tamil extends Thread{
    Raja r;
    Tamil(Raja r){
        this.r = r;
    }
    public void run() {
        r.multiply(5);
    }
}
class Ramu extends Thread{
    Raja r;
    Ramu(Raja r){
        this.r = r;
    }
    public void run() {
        r.multiply(10);
    }
}
public class Synchronizedmethod {
    public static void main(String[] args) {
        Raja x = new Raja();
        Tamil t = new Tamil(x);
        Ramu r = new Ramu(x);
        t.start();
        r.start();
    }
}
