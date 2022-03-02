class mfunc{

    static int multi(int n){
        for (int i = 1; i <=10; i++) {
            int result = n * i;
            System.out.printf(" %d * %d = %d \n",n,i,result);
        }


        return 0;

    }
    public static void main(String[] args) {
        System.out.println("Namaste World");
         multi(5);

    }
}