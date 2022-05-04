
class InvalidAge extends Exception {
    InvalidAge(String str) {
        super(str);
    }
}

public class Q1 {

    static void validate(int age) throws InvalidAge {
        if (age >= 5) {
            System.out.println("less than 5");
        }

        if (age <= 18) {
            throw new InvalidAge("Age is above 18");
        }

    }

    public static void main(String[] args) {

        try {
            throw new InvalidAge("Erroe");
        } catch (InvalidAge e) {
            System.out.println(e);
            // e.printStackTrace();
        }

    }
}
