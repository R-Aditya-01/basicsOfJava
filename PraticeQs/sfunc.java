public class sfunc {
    static int star(int n){
        for (int i = 1; i <n; i++) { //rows
            for (int j = 0; j < i; j++) { //cols
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Namaste world!");
        star(5);
    }
}
