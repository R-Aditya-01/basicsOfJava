import java.util.*;

class Bill extends Thread {
    Scanner sc = new Scanner(System.in);
    int fe = 0;

    Bill() {
        start();
    }

    public void run() {
        System.out.println("\nEnter the number of dish 1 (Rs. 50): ");
        int d1 = sc.nextInt();
        System.out.println("Enter the number of dish 2 (Rs. 75): ");
        int d2 = sc.nextInt();
        System.out.println("Enter the number of dish 3 (Rs. 100): ");
        int d3 = sc.nextInt();
        System.out.println("Enter the number of dish 4 (Rs. 150): ");
        int d4 = sc.nextInt();
        int bill = d1 * 50 + d2 * 75 + d3 * 100 + d4 * 150;
        System.out.println("The bill is: " + bill);
    }
}

class Q13 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int n = sc.nextInt();

        int fa = 0, m = 0, fe = 0;
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0) {
                Bill b = new Bill();
                b.join();
                fa++;
            }
            if (i % 5 == 1) {
                Bill b1 = new Bill();
                b1.join();
                fa++;
            }
            if (i % 5 == 2) {
                Bill b2 = new Bill();
                b2.join();
                fa++;
            }
            if (i % 5 == 3) {
                Bill b3 = new Bill();
                b3.join();
                m++;
            }
            if (i % 5 == 4) {
                Bill b4 = new Bill();
                b4.join();
                fe++;
            }

        }
        System.out.println("\nTotal number of Faculty = " + fa);
        System.out.println("Total number of Students = " + (m + fe));
    }
}
