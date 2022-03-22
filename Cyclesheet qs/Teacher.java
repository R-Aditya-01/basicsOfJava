import java.util.Scanner;

class Teacher {
    int n;
    float avg;
    Student[] s;

    Teacher(int n) {
        this.n = n;
    }

    void findClassAverage() {
        s = new Student[3];
        for (int i = 0; i < 3; i++)
            s[i] = new Student();
        int tot = 0;
        for (int i = 0; i < 3; i++)
            tot += s[i].getIndividualTotal();
        System.out.println(tot / 3);
        findMax();
    }

    void findMax() {
        int sum =0;
        for (int i = 0; i < 5; i++)
                sum += s[2].marks[i];
            
        System.out.println(sum);
    }

    class Student {
        int[] marks = new int[5];

        Student() {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 5; i++)
                marks[i] = sc.nextInt();
        }

        int getIndividualTotal() {
            int sum = 0;
            for (int i = 0; i < 5; i++)
                sum += marks[i];
            return sum;
        }
    }
}

class Marks {
    public static void main(String[] args) {
        Teacher te = new Teacher(3);
        te.findClassAverage();
    }
}