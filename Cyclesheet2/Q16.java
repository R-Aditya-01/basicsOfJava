import java.util.*;
import java.io.*;

class Q16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        FileReader fr = new FileReader("Q16Text.txt");
        BufferedReader br = new BufferedReader(fr);

        Map<String, List<String>> filemap = new TreeMap<>();

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;

            } else {

                String temp1 = s.substring(0, s.indexOf("(") - 1).toLowerCase();
                String temp2 = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
                if (temp1.endsWith("?")) {

                    temp1 = temp1.substring(0, temp1.length() - 2);
                }
                String[] sentence = temp1.split(" ");
                String[] tags = temp2.split(" ");
                for (int i = 0; i < tags.length; i++) {
                    if (filemap.containsKey(tags[i])) {
                        if (!filemap.get(tags[i]).contains(sentence[i])) {

                        }
                    } else {

                        filemap.get(tags[i]).add(sentence[i]);

                        List<String> temp = new ArrayList<>();
                        temp.add(sentence[i]);
                        filemap.put(tags[i], temp);

                    }
                }
            }
        }
        System.out.println("Map : ");
        System.out.println(filemap);

        System.out.print("\nEnter the phrase : ");
        String phrase = sc.nextLine().toLowerCase();
        String[] phraselst = phrase.split(" ");

        String[][] psphrase = new String[phraselst.length][];
        System.out.println("\n2-D ragged array : ");
        for (int i = 0; i < phraselst.length; i++) {
            int count = 0;
            for (String s : filemap.keySet()) {
                if (filemap.get(s).contains(phraselst[i])) {
                    count += 1;
                }
            }
            psphrase[i] = new String[count];
            int j = 0;
            for (String s : filemap.keySet()) {
                if (filemap.get(s).contains(phraselst[i])) {
                    psphrase[i][j] = s;
                    j++;
                }
            }

            for (int k = 0; k < count; k++) {
                System.out.print(psphrase[i][k] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the tags : ");
        String tags = sc.nextLine().toUpperCase();
        String[] tagslst = tags.split(" ");

        boolean flag = true;
        for (int i = 0; i < tagslst.length; i++) {
            boolean found = false;
            for (String s : psphrase[i]) {
                if (s.equals(tagslst[i])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                flag = false;
                break;
            }
        }

        System.out.println("\nAcceptance Status : ");
        if (flag) {

        } else {

        }
    }
}
