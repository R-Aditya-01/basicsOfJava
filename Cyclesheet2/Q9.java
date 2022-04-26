import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

interface BCD {
    String[] BCDarr = { "0101", "0100", "0000", "1111", "1000", "1011", "1001", "0111", "1010", "0110" };

    public void decimalToBCD();

    class ToDecimal {
        static Map<Integer, String> array2d = new HashMap<>();

        public void formarray2d() {
            for (int i = 0; i < BCDarr.length; i++) {
                int decimal = Integer.parseInt(Character.toString(BCDarr[i].charAt(0))) * 8

                        + Integer.parseInt(Character.toString(BCDarr[i].charAt(1))) * 4

                        + Integer.parseInt(Character.toString(BCDarr[i].charAt(2))) * -2

                        + Integer.parseInt(Character.toString(BCDarr[i].charAt(3))) * -1;
                array2d.put(decimal, BCDarr[i]);
            }
        }
    }
}

class Class8421 implements BCD

{
    Scanner sc = new Scanner(System.in);

    public void decimalToBCD() {
        String[] t = new String[3];
        BCD.ToDecimal obj = new BCD.ToDecimal();
        System.out.print("Enter a decimal number: ");
        String n = sc.nextLine();
        obj.formarray2d();
        System.out.print("BCD : ");
        for (int i = 0; i < n.length(); i++) {

            System.out.print(obj.array2d.get(Integer.parseInt(Character.toString(n.charAt(i)))) + " ");
        }
        System.out.println();
    }
}

class Complement9 extends Class8421 {
    Scanner sc = new Scanner(System.in);

    void findCompliment() {
        System.out.print("\nEnter the BCD number: ");
        String[] number = sc.nextLine().split(" ");
        System.out.print("9's Complement : ");
        for (String s : number) {
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')

                {
                    temp += 1;
                } else {
                    temp += 0;
                }
            }

            System.out.print(temp + " ");
        }
        System.out.println();
    }

    void findDecimalEquivalent() {
        BCD.ToDecimal obj = new BCD.ToDecimal();
        System.out.print("\nEnter the complemented BCD number: ");
        String[] number = sc.nextLine().split(" ");
        System.out.print("Decimal equivalent : ");
        for (String s : number) {
            for (Entry<Integer, String> entry : obj.array2d.entrySet()) {
                if (entry.getValue().equals(s)) {
                    System.out.print(entry.getKey());
                }
            }
        }
        System.out.println();
    }
}

class Q9 {
    public static void main(String[] args) {
        new Class8421().decimalToBCD();
        new Complement9().findCompliment();
        new Complement9().findDecimalEquivalent();
    }
}
