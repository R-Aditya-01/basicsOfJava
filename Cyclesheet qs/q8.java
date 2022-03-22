import java.util.*;
import java.io.*;

public class q8 {
    private static String inputText;
    private static String[] SA;
    private static Integer[][] IA;
    private int numWords;

    public main(String[] useInput args) {
        this.inputText = userInput;
        this.SA = userInput.split("\\s+");
        this.numWords = SA.length;
        this.IA = new Integer[numWords][];
    }

    public void encodeText() {
        try {
            int i = 0;
            for (String str : SA) {
                byte array[] = str.getBytes("UTF8");
                this.IA[i] = convert(array);
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void encodeText(int POSTFIX) {
        int MAX = 0;
        for (Integer[] arr : this.IA) {
            if (arr.length > MAX) {
                MAX = arr.length;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for (Integer[] arr : this.IA) {
            temp.clear();
            if (arr.length < MAX) {
                temp = Arrays.asList(arr);
                for (Integer i : arr) {
                    temp.add(i);
                }
                for (int i = 0; i < MAX - arr.length; i++) {
                    temp.add(POSTFIX);
                }
            }
            this.IA[j] = temp.toArray(new Integer(MAX));
            j++;
        }
    }

    public void sort() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(this.SA));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted List of Words: \n" + words);
        String[] arr = new String[words.size()];
        arr = words.toArray(arr);
        this.SA = arr;
    }

    public Integer[] convert(byte buf[]) {
        Integer intArr[] = new Integer[buf.length / 4];
        int offset = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (buf[3 + offset] & 0xFF) | ((buf[2 + offset] & 0xFF) << 8) |
                    ((buf[1 + offset] & 0xFF) << 16) | ((buf[0 + offset] & 0xFF) << 24);
            offset += 4;
        }
        return intArr;
    }

    public void printEncodedArray() {
        for (Integer[] arr : this.IA) {
            System.out.println(Arrays.toString(arr) + "\n");
        }
    }

    // main method to take input from user...
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number of inputs: ");
        n = sc.nextInt();
        StringBuffer userInput = new StringBuffer();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String in = sc.nextLine();
            userInput.append(" " + in);
        }

        // sorting according to words
        Main encoding = new Main(String.valueOf(userInput));
        encoding.sort();
        encoding.encodeText();
        encoding.encodeText(-1);
        encoding.printEncodedArray();

    }
}