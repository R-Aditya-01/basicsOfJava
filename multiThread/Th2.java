
class mythr extends Thread {
    // creating a constructor
    public mythr(String name) {

        super(name);
    }

    public void run() {
        System.out.println("Thread 1 ");

    }
}

public class Th2 {
    public static void main(String[] args) {
        mythr t = new mythr("ASR");
        t.start();
    }
}
