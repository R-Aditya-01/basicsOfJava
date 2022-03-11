import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        System.out.print("Enter the size of matrix: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        System.out.print("Enter the values in matrix: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.next().charAt(0);
        System.out.println("Matrix:");
        for (char[] j : a) {
            for (char k : j)
                System.out.print(k + " ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int z = i;
            while (z > 0) {
                char x = a[i][0];
                for (int j = 1; j < n; j++)
                    a[i][j - 1] = a[i][j];
                a[i][n - 1] = x;
                z--;
            }
        }
        for (int j = 0; j < n; j++) {
            int z = j;
            while (z > 0) {
                char y = a[0][j];
                for (int i = 1; i < n; i++)
                    a[i - 1][j] = a[i][j];
                a[n - 1][j] = y;
                z--;
            }
        }
        System.out.println("Rotated matrix:");
        for (char[] i : a) {
            for (char j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
