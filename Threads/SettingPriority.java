package Threads;

public class SettingPriority extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread t = Thread.currentThread();
            String x = t.getName();
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        SettingPriority sp = new SettingPriority();
        SettingPriority sp1 = new SettingPriority();
        SettingPriority sp2 = new SettingPriority();
        sp.setName("Thread 1");
        sp1.setName("Thread 2");
        sp2.setName("Thread 3");
        sp.setPriority(1);
        sp1.setPriority(5);
        sp2.setPriority(10);
        sp.start();
        sp1.start();
        sp2.start();
    }
}
