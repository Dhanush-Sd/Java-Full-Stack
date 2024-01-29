package Threads;

public class GettingPriority extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread t = Thread.currentThread();
            String x = t.getName();
            int h = t.getPriority();
            System.out.println(x+" "+h);
        }
    }

    public static void main(String[] args) {
        GettingPriority g = new GettingPriority();
        GettingPriority gp = new GettingPriority();
        GettingPriority gp1 = new GettingPriority();
        g.setName("Thread 1");
        gp.setName("Thread 2");
        gp1.setName("Thread 3");
        g.setPriority(MIN_PRIORITY);
        gp.setPriority(NORM_PRIORITY);
        gp1.setPriority(MAX_PRIORITY);
        g.start();
        gp.start();
        gp1.start();
    }
}
