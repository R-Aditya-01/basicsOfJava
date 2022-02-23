public class func{
    
    int sum(int x, int y){
        int z = x + y;
        return z;
    }
    
    public static void main(String[] args)
    {
        // adding two numbers;
        
        // int a=5,b=9;
        // int c=sum(a,b);
        // System.out.println(c);
        
        // int m=1,n=10;
        // int o = sum(m,n);
        // System.out.println(o);
        
        // using class method; 
        // for that remove 
        // static from the function and then
        // this process may follow;
        func s = new func();
        
        int p=1,q=2;
        int r=s.sum(p,q);
        System.out.println(r);
        
        
    }
}