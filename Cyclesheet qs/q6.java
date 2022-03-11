import java.util.Scanner;

public class q6 {

    public static void main(String Arg[]) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();

        String a = "";
        boolean flag = false;
        int count = 0;
        for (int k = 0; k < n; k++) {
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            str = str.toUpperCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    flag = true;
                    a += "V";
                } else {
                    if (flag) {
                        count++;
                    }
                    flag = false;
                    a += "C";
                }
            }
            System.out.println(count);
            System.out.println(a);
            count = 0;
            a = "";
        }
    }
}
