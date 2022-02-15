
public class condition{
    public static void main(String[] args){
        
        float m1 = 45.59f;
        float m2 = 76.43f;
        float m3 = 35.39f;
        
        float total = 300.0f;
        float sum = m1 + m2 + m3;
        boolean check = false;
        
        if(m1>=33.0 && m2>=33.0 && m3>=33.0){
            
            float per = sum/total * 100;
            if(per>=40){
                check = true;
            }
        }
        else{
            System.out.println("Fail");
        }
        System.out.println(check);
    }
}