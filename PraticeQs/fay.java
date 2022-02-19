import java.util.Scanner;

public class fay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float [] array = new float [5];
        for(int i = 0 ;i<5;i++){
            float a = sc.nextFloat();
            array[i] = a;
            sum=sum+a;
        }
        System.out.println(sum);
        
    }
}