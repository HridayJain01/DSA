package Problems;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        
        moveZero(arr, n);
        
        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void moveZero(int[] arr, int n) {
         int k=0;
         for(int i=0;i<n;i++){
             if(arr[i]!=0){
                 arr[k++]=arr[i];
             }
         }
            while(k<n){
                arr[k++]=0;
        }
    }
}
