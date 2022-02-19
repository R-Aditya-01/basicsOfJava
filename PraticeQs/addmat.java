

public class addmat{
    public static void main(String[] args){
        // System.out.println();
        
        int [][] m1 = {{1,2,3},
            {4,5,7}};
        int [][] m2 = {{2,3,4},
            {5,6,7}};
        
        int [][] m3 = new int[2][3];
        // System.out.println(m3.length);
        for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[i].length;j++){
                m3[i][j] = m1[i][j] + m2[i][j]; 
            }
        }
        
        for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[i].length;j++){
                System.out.print(m3[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
    }
}