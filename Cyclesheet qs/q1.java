import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

import org.w3c.dom.TypeInfo;

public class q1 {
	public static void main(String[] args) {
		System.out.println("Namaste World");
		Scanner scc = new Scanner(System.in);
		int num = scc.nextInt();
		int ic = 0, fc = 0, stc = 0;

		for (int i = 0; i < num; i++) {

			Scanner sc1 = new Scanner(System.in);
			// int rn = sc.nextInt();
			// float cgpa = sc.nextFloat();
			// String nam = sc.nextLine();

			if (sc1.hasNextInt()) {
				System.out.println("int");
				int rn = sc1.nextInt();
				ic++;
			} else if (sc1.hasNextFloat()) {
				System.out.println("float");
				fc++;
				float cgpa = sc1.nextFloat();
			} else if (sc1.hasNextLine()) {
				System.out.println("string");
				stc++;
				String nam = sc1.nextLine();
			}
		}

		System.out.print(ic + "\n" + fc + "\n" + stc);

		// sc.close();4
	}
}