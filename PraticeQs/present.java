import java.util.Scanner;


public class present{
    public static void main(String[] args){
        
        
        int [] array = new int[3];
        array[0] = 4;
        array[1] = 1;
        array[2] = 9;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to check in a array : ");
        int a = sc.nextInt();
        for(int i = 0 ; i<array.length;i++){
            if(array[i]==a){
                System.out.printf("Element '%d' found at index '%d' \n",a,i);
            }
        }
    }
}

