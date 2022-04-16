
class thread1 extends Thread {

    public void start() {
        System.out.println("Namaste World 1 " + a);
    }

}

class thread2 extends Thread {
    public void start() {
        System.out.println("Namaste World 2");
    }

}

class thread3 extends Thread {
    public void start() {
        System.out.println("Namaste World 3");
    }

}

class thread4 extends Thread {
    public void start() {
        System.out.println("Namaste World 4");
    }

}

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Namaste World");
        int marks1[] = { 1, 2, 3, 4, 5 };
        int marks2[] = { 6, 7, 8, 9, 20 };

        int fcount1[] = { 3, 4, 17, 8, 23 };
        int fcount2[] = { 10, 4, 6, 5, 2 };

        thread1 T1 = new thread1(marks1, fcount1);
        thread2 T2 = new thread2(marks2, fcount2);
        thread3 T3 = new thread3(fcount1);
        thread4 T4 = new thread4(fcount2);

        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
}