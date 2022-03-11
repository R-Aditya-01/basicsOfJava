public class demo_q2 {
    public static void main(String[] args) {
        int i;
        boolean flag = true;
        float charge = 0;
        for (i = 0; i < args.length; i += 3) {
            String name = args[i];
            float total = Float.parseFloat(args[i + 1]);
            float trans = Float.parseFloat(args[i + 2]);
            float abstrans = Math.abs(trans);
            if (trans >= 0)
                total += trans;
            else {
                if (abstrans > total || abstrans > 2500)
                    flag = false;
                else {
                    if (abstrans <= 500)
                        charge = 5;
                    else if (abstrans < 1000)
                        charge = 8;
                    else if (abstrans < 5000)
                        charge = 10;
                    else if (abstrans < 15000)
                        charge = 12;
                    else if (abstrans < 15000)
                        charge = 15;
                    total = total - abstrans - charge;
                }
            }
            System.out.println(name);
            if (flag == false)
                System.out.println("transaction failed");
            System.out.println(total);
        }
    }

}
