import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Namaste World!");
        for (int i = 0; i < 2; i++) {

            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int total = sc.nextInt();
            int w = sc.nextInt();

            if (w > 0) {
                total = total + w;
            }
            if (w < 0) {
                total = total - w;
            }

            if (w > total && w > 25000) {
                System.out.println("Failed Transaction");
            }

            System.out.println();
            System.out.println(name + " " + total);
        }

    }
}
