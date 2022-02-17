
public class array{
    public static void main(String[] args){
        
        for(int i =0;i<4;i++){  // 1st loop for rows
                for(int j=4;j>i;j--){  // 2nd loop for col
                    System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}