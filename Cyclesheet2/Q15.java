import java.util.*;

class NotPrimeException extends Exception {
    NotPrimeException(int a) {
        System.out.println(a + " is NOT a Prime Number");
    }
}

class Prime

{
    boolean flag = false;

    void checkPrime(int a) {

        try {

            if (a == 0 || a == 1)
                throw new NotPrimeException(a);
            for (int i = 2; i <= a / 2; ++i) {

                if (a % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(a + " is a prime number.");

            else

                throw new NotPrimeException(a);

        }

        catch (NotPrimeException npe) {
        }
    }
}

class NotTwinException extends Exception {
    NotTwinException(int a, int b) {
        System.out.println(a + " and " + b + " are NOT twin primes");
    }
}

class TwinPrime extends Prime {
    void checkTwinPrime(int a, int b) {
        checkPrime(a);
        checkPrime(b);
        try {
            if ((Math.abs(a - b)) != 2)
                throw new NotTwinException(a, b);

            else
                System.out.println(a + " and " + b + " are twin primes");

        }

        catch (NotTwinException nte) {
        }
    }
}

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pairs to be processed: ");
        int n = sc.nextInt();
        TwinPrime tp = new TwinPrime();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            tp.checkTwinPrime(a, b);
        }

    }
}
