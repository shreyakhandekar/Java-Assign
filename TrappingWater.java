import java.util.Scanner;

public class TrappingWater {
    public static int maxWater(int[] arr, int n){
    int res =0;
    for (int i=1; i<n-1;i++)
    {
        int left = arr[i];
        for (int j=0;j<i;j++){
            left = Math.max(left,arr[j]);
        }
        int right = arr[i];
        for(int j=i+1; j<n; j++){
            right = Math.max(right,arr[j]);
        }
        res+= Math.min(left,right)- arr[i];
    }
    return res;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want to store: ");
        n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("\nEnter the elements of arrays: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

        System.out.println("\nMaximum water can be accumulates: " + maxWater(arr,n));
    }
}
