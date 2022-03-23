
class Thread1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("1: Namaste World");
            System.out.println("Thread 1 is running!");
            i++;
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("2: Namaste World");
            System.out.println("Thread 2 is running!");
            i++;
        }
    }
}

public class Th1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
