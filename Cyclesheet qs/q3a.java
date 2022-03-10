import java.util.Scanner;

class q3a {
    static int calc(int n) {
        if (n == 1)
            return n;
        int value = n;
        for (int i = n; i > 1; --i) {
            value += (int) Math.pow(10, i - 1) * n;
        }

        return value - calc(n - 1);
    }

    // Driver code
    public static void main(String ar[]) {
        // no. of terms to find the sum
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum is " + calc(n));
        sc.close();

    }
}