package Recursion;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println("The number of unique paths from top left to bottom right is: " + Paths(2, 3));

    }
    public static int Paths(int m,int n)
    {
        if (m == 1 || n == 1) {
                return 1;
            } else {
                return Paths(m - 1, n) + Paths(m, n - 1);
            }

    }
}
