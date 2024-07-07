package Problems;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 1;
        
        leftRotate(arr, n, d);
        
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void leftRotate(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
