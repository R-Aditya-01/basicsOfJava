public class fibfunc {
    static int fib(int n){
        int a = 0,b = 1,sum=0,i=0;
        while(i!=n){

            sum = a+b;
            a=b;
            b=sum;
            i=i+1;
            System.out.println(a);
            

        }

        return 0;
    }


    public static void main(String[] args) {
        // output : 0 1 1 2 3 5 8 13
        System.out.println(0);
        fib(7);
        
        // for (int i = 0; i < 7; i++) {
        //     System.out.println(fib(i));
        // }
    }
}
