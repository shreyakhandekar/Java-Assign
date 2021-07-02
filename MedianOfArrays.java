import java.util.Scanner;

class MedianOfArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int count = 0, median = 0;
        int i=0, j=0;

        if ((m+n) % 2 == 0) {
            int firstElement = 0;
            for (count = 1; count <= (m+n)/2 + 1; count++) {
                if (i < m && j < n) {
                    if (nums1[i] <= nums2[j])
                        median = nums1[i++];
                    else
                        median = nums2[j++];
                } else if (i == m) {
                    median = nums2[j++];
                } else if (j == n) {
                    median = nums1[i++];
                }
                if (count == (m+n)/2) {
                    firstElement = median;
                }
            }
            return (double)(firstElement + median) / 2;
        } else {
            for (count = 1; count <= (m+n)/2 + 1; count++) {
                if (i < m && j < n) {
                    if (nums1[i] <= nums2[j])
                        median = nums1[i++];
                    else
                        median = nums2[j++];
                } else if (i == m) {
                    median = nums2[j++];
                } else if (j == n) {
                    median = nums1[i++];
                }
            }
        }
        return median;
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter number of elements in array1: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array1: ");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements in array2: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter array2: ");
        for (int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        MedianOfArrays obj = new MedianOfArrays();
        System.out.println("Median is: "+obj.findMedianSortedArrays(a,b));
    }
}
