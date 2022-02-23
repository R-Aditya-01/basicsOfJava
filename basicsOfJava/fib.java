
public class coan {
  static int fibonacci(int x){
    if(x==0){
      return 0;
    }
    else if(x==1){
      return 1;
    }
    else {
      return fibonacci(x-1)+fibonacci(x-2);
    }
  }
    public static void main(String[] args)
    {  
       //0 1 1 2 3 5 8 13 21 34...
       int n=10;
      for(int i=0;i<=n;i++)
      {
        System.out.print(fibonacci(i)+" ");
      }
  }
}