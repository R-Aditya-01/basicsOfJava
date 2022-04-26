import java.util.*;

class Q14 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int intcount = 0, floatcount = 0;
        System.out.println("Enter the numeric inputs: ");
        for (int i = 0; i < 10; i++) {

            try {

                int n = sc.nextInt();
                intcount++;

            }

            catch (InputMismatchException ie) {
                float f = sc.nextFloat();
                floatcount++;
            }
        }
        System.out.println("Integer Count= " + intcount);
        System.out.println("Float Count= " + floatcount);
    }
}
