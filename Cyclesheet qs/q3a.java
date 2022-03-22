import java.util.Scanner;

class q3a {
    public static void main(String[] args) {
        int x, Sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            x = 0;
            for (int j = 0; j < i; j++)
                x += Math.pow(10, j) * i;
            if ((i % 2) == 0)
                x = -x;
            Sum += x;
        }
        System.out.println(Sum);
    }
}