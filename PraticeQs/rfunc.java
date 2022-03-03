// to create a recursive function : sum of n naturla numbers
public class rfunc {

    static int nsum(int n){
        if (n==0){return 0;}  // as soon a this line get excuted the code gets over bcz no func is called again;
        else { System.out.print(n + " ");
            return n + nsum(n-1);}
    }


    public static void main(String[] args) {
        // System.out.println("Namaste World!");
        System.out.println(nsum(5));


    }

    
}
