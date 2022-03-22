import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int start = input.indexOf('{');
        int end = input.indexOf('}');
        String extract = input.substring(start + 1, end);
        String[] s = extract.split("\\),");
        String[] keys = new String[s.length];
        int[] values = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            String[] parts = s[i].split(":");
            keys[i] = parts[0].replace("'", "");
            keys[i] = keys[i].replace(" ", "");
            parts[1] = parts[1].replace("(", "");
            parts[1] = parts[1].replace(")", "");
            parts[1] = parts[1].replace(" ", "");
            int sum = 0;
            String[] newvalues = parts[1].split(",");
            for (String num : newvalues) {
                String x;
                if (num.charAt(0) == '-') {
                    x = num.substring(1);
                    sum += (Integer.parseInt(x) * -1);
                } else
                    sum += (Integer.parseInt(num));
            }
            values[i] = sum;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
        }
    }
}
