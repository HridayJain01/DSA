package Recursion;

public class Partition {
    public static void main(String[] args) {
    int count =parts(9, 5) ;
    System.out.println("The number of partitions is " + count);   
        
    }
    public static int parts(int m, int n)
    {
        if(m == 0)
        {
            return 1;
        }
        if (n==0 || m < 0) {
            return 0;
        }
        return parts(m-n, n)+parts(m, n-1);
        
    }
}
