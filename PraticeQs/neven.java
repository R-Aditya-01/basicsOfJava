public class neven{
    public static void main(String[] args){
        
        int n = 10,cout = 1,sum=0;
        
        while(cout!=n+1){
            if(cout%2==0 ){
                sum=sum+cout;
            }
            cout++;
        }
        
        System.out.println(sum);
        
    }
    
}