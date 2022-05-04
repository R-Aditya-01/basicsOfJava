abstract class Test {
    int a = 10;

    Test() {
        System.out.println(a);
    }

    Test(int a, int b) {
        System.out.println(a + " " + b);
    }
}

class TestChild extends Test {

    int a = 5;

    TestChild() {
        this(5.0);
        System.out.println("no parameter");
    }

    TestChild(int b) {
        super(b, b);
        System.out.println(" parameter" + b);
        new TestChild();
    }

    TestChild(int b, int a) {
        this(a);
        System.out.println("b parameter" + b);
    }

    public static void main(String[] args) {

        new TestChild();
        new TestChild(5);
    }
}
