import java.util.Scanner;

public class array{
    public static void main(String[] args){
        
        int [][] m1 = new int[2][3];
        int [][] m2 = new int[2][3];
        int [][] m3 = new int[2][3];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input for Matrix 1: ");
        
        for(int i = 0;i<m1.length;i++){
                for(int j = 0;j<m1[i].length;j++){
                    int a1 = sc.nextInt();
                    m1[i][j]=a1;
            }
        }
        System.out.println("Input for Matrix 2: ");
        
        for(int i = 0;i<m2.length;i++){
                for(int j = 0;j<m2[i].length;j++){
                    int a2 = sc.nextInt();
                    m2[i][j]=a2;
            }
        }
        
        System.out.println("Adding Two Matrix  ");
        
        for(int i = 0;i<m3.length;i++){
                for(int j = 0;j<m3[i].length;j++){
                    
                    m3[i][j] = m1[i][j] + m2[i][j]; 
            }
            
        }
        
        System.out.print("Matrix 3 :\n");
        
        for(int i = 0;i<m3.length;i++){
                for(int j = 0;j<m3[i].length;j++){
                    
                    System.out.print(m3[i][j]);
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
        
        
    }
}