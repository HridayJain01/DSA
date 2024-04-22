package Recursion;
class PrintName
{
    public static void recurse(String name,int n)
    {
        if (n==1) {
            System.out.println(name);
            
        }
        else{
            System.out.println(name);
            recurse(name, n-1);
        }
    }
    public static void main(String[] args) {
        String name="Hriday";
        int n=3;
        recurse(name,n);
    }
}