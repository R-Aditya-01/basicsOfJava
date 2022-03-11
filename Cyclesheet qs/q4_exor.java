public class q4_exor {
    public static void main(String[] args) {
        int[] a = { 2, -1, 4, 3, -1, 0, 5 };
        int n = 7;
        int[][] arr = new int[5][];
        int dist = 1;
        for (int i = 0; i < n - 2; i++) {
            dist += 1;
            arr[i] = new int[n - i - 1];
            for (int j = 0; j <= n - dist; j += 1) {
                for (int k = j; k < j + dist; k++)
                    arr[i][j] += a[k];
            }
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        int j;
        for (int i = 0; i < arr.length; i++) {
            middle: for (j = 0; j < arr[i].length - 1; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    int res1 = arr[i][j] | arr[i][k];
                    int res2 = arr[i][j] ^ arr[i][k];
                    System.out.println("[" + arr[i][j] + "," + arr[i][k] + "]" + " OR =" + res1 + " XOR =" + res2);
                    if (res1 == res2) {
                        System.out.println("row " + i + " is abruptly terminated");
                        break middle;
                    }
                }
            }
            if (j == arr[i].length - 1)
                System.out.println("row " + i + " is processed entirely");
        }

    }
}
