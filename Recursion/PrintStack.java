package Recursion;

public class PrintStack {
    public int recurse(int n)
    {
        
        if(n==0)
        {
            return 0;
        }
        else{
            
            return n+recurse(n-1);
        }
        
    }
    public static void main(String[] args) {
        PrintStack pStack=new PrintStack();
        int n=3;
        int x=pStack.recurse(n);
        System.out.println(x);
        
    }
    
}
