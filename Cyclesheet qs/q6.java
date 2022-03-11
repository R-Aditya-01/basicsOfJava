import java.util.Scanner;

public class q6 {

    public static void main(String Arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        String a = "";
        boolean flag = false;
        int count = 0;
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
    }
}
