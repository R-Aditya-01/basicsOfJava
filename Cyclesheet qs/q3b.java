public class q3b {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.print(1);

            for (int j = 0; j < 2 * (i - 1) - 1; j++)
                System.out.print(" ");

            if (i != 1)
                System.out.print(i);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--)
                System.out.print(" ");
            System.out.print(1);

            for (int j = 0; j < 2 * (i - 1) - 1; j++)
                System.out.print(" ");

            if (i != 1)
                System.out.print(i);
            System.out.println();
        }
    }
}
