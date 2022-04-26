class SumFiXi extends Thread {
    int fi[], xi[], n1, n2;
    int sum = 0;

    SumFiXi(int[] xi, int[] fi, int n1, int n2) {
        this.fi = fi;
        this.xi = xi;
        this.n1 = n1;
        this.n2 = n2;
        this.start();
    }

    synchronized public void run() {
        for (int i = n1; i < n2; i++) {
            sum += (fi[i] * xi[i]);
        }
    }

    int fixi() {

        return sum;
    }
}

class SumFi extends Thread {
    int fi[], n1, n2;
    int sum = 0;

    SumFi(int[] fi, int n1, int n2) {
        this.fi = fi;
        this.n1 = n1;
        this.n2 = n2;
        this.start();
    }

    public void run() {
        for (int i = n1; i < n2; i++) {
            sum += fi[i];
        }
    }

    int sumoffi() {
        return sum;
    }
}

class Q12 {
    public static void main(String[] args) throws InterruptedException {
        int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int f[] = { 3, 4, 17, 8, 23, 10, 4, 6, 5, 2 };
        int totsumfixi, totsumfi;
        float mean;
        SumFiXi fx1 = new SumFiXi(x, f, 0, 5);
        SumFiXi fx2 = new SumFiXi(x, f, 5, 10);
        fx1.join();
        fx2.join();
        totsumfixi = fx1.fixi() + fx2.fixi();
        System.out.println("Total sum of FiXi is: " + totsumfixi);
        SumFi f1 = new SumFi(f, 0, 5);
        SumFi f2 = new SumFi(f, 5, 10);
        f1.join();
        f2.join();
        totsumfi = f1.sumoffi() + f2.sumoffi();
        System.out.println("Total sum of Fi is: " + totsumfi);
        mean = (float) (totsumfixi / totsumfi);
        System.out.println("Mean = " + mean);
    }
}
