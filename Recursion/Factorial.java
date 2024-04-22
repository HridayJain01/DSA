package Recursion;

public class Factorial {
    public int fact(int n)
    {
        if (n==1) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Factorial pStack=new Factorial();
        int n=5;
        int x=pStack.fact(n);
        System.out.println(x);
        
    }

}
