import java.util.*;

class Line {
    int x1, y1, x2, y2;

    Line() {
    }

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        try {
            if (x1 == x2 && y1 == y2)
                throw new NumberFormatException();
        } catch (NumberFormatException nfe) {
            System.out.println(nfe + " is thrown");
        }
    }
}

class TriangleNotPossibleException extends Exception {

    TriangleNotPossibleException() {
    }
}

class Triangle extends Line {
    int c = 0;

    void triangleCal() {
        boolean flag = false;
        while (!flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the points for line 1");
            System.out.println("Enter the cartesian coordinates of point 1: ");
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            System.out.println("Enter the cartesian coordinates of point 2: ");
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            Line l1 = new Line(n1, m1, n2, m2);
            System.out.println("\nEnter the points for line 2");
            System.out.println("Enter the cartesian coordinates of point 1: ");
            n1 = sc.nextInt();
            m1 = sc.nextInt();
            System.out.println("Enter the cartesian coordinates of point 2: ");
            n2 = sc.nextInt();
            m2 = sc.nextInt();
            Line l2 = new Line(n1, m1, n2, m2);
            try {
                if (l1.x1 == l2.x2 && l1.y1 == l2.y2 || l1.x2 == l2.x1 &&
                        l1.y2 == l2.y1 || l1.x1 == l2.x1 && l1.y1 == l2.y1 || l1.x2 == l2.x2 && l1.y2 == l2.y2)

                    flag = true;

                else
                    throw new TriangleNotPossibleException();

            }

            catch (TriangleNotPossibleException tnpe) {
                System.out.println(tnpe + " is thrown");
                c++;
            }
        }
        System.out.println("The Triangle is valid\nTotal number of additional attempts:" + c);
    }
}

class Q11 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.triangleCal();
    }
}
