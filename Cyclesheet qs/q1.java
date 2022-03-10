
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		// System.out.println("Namaste World");
		Scanner scc = new Scanner(System.in);
		int num = scc.nextInt();
		int ic = 0, fc = 0, stc = 0, s = Integer.MAX_VALUE, l = Integer.MIN_VALUE;
		float csum = 0;
		String con = " ";

		for (int i = 0; i < num; i++) {

			Scanner sc1 = new Scanner(System.in);

			if (sc1.hasNextInt()) {
				System.out.println("int");
				int rn = sc1.nextInt();
				if (rn < s) {
					s = rn;
				}

				if (rn > l) {
					l = rn;
				}

				ic++;
			} else if (sc1.hasNextFloat()) {
				System.out.println("float");
				fc++;
				float cgpa = sc1.nextFloat();
				csum += cgpa;

			} else if (sc1.hasNextLine()) {
				System.out.println("string");
				stc++;
				String nam = sc1.nextLine();
				con += nam + ",";
			}
			sc1.close();
		}

		float avg = csum / fc;

		System.out.println(ic + "\n" + fc + "\n" + stc + "\n" + avg);
		System.out.println(s + "\n" + l);
		System.out.println(con);

		scc.close();

	}
}