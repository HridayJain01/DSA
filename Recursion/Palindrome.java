package Recursion;

public class Palindrome {

    public static boolean palin(String str,int l,int r)
    {
        
        if(l>=r)
        {
            return true;
        }
        if(str.charAt(l)!=str.charAt(r))
        {
            return false;

        }
        return palin(str, l+1, r-1);

    }
    public static void main(String[] args) {
        String pal = "h";

        if (palin(pal, 0, pal.length()-1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }



    }
    
}
