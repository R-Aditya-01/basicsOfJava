
// import file class;
import java.io.File;
import java.io.FileWriter;
// if user inputs improper data into program;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {

        try {
            File file = new File("read.txt");
            // FileWriter nfile = new FileWriter("write.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String> BCT = new ArrayList<String>();
            ArrayList<String> BDS = new ArrayList<String>();
            ArrayList<String> BKT = new ArrayList<String>();

            while (sc.hasNextLine()) {
                String data = sc.nextLine();

                if (data.contains("BCT")) {
                    BCT.add(data);
                } else if (data.contains("BDS")) {
                    BDS.add(data);

                } else if (data.contains("BKT")) {
                    BKT.add(data);

                }
            }

            System.out.println("BCT: " + BCT);
            System.out.println("BDS: " + BDS);
            System.out.println("BKT: " + BKT);

        } catch (IOException e) {
            System.out.println("Error occured!");
            e.printStackTrace();
            // TODO: handle exception
        }

    }
}
