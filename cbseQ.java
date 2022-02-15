import java.util.Scanner;

public class cbse{
    public static void main(String[] args){
        
        System.out.println("-----------Calculate CBSE Marks %-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Subject Marks:");
        float m1 = sc.nextFloat();
        System.out.println("Enter your Second Subject Marks:");
        float m2 = sc.nextFloat();
        System.out.println("Enter your Third Subject Marks:");
        float m3 = sc.nextFloat();
        System.out.println("Enter your Fourth Subject Marks:");
        float m4 = sc.nextFloat();
        System.out.println("Enter your Fifth Subject Marks:");
        float m5 = sc.nextFloat();
        
        float sum = m1 + m2 + m3 + m4 + m5;
        float percnt = sum/500 * 100;
        System.out.println("Your Cbse percentage :" + percnt);
        System.out.println(percnt);
    }
    
}