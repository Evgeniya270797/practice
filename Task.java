package algoriphSort;



import java.util.Arrays;
import java.util.Scanner;

public class Task {

    private static long mergeAndCount(int[] arr, int l,
                                      int m, int r)
    {


        int[] left = Arrays.copyOfRange(arr, l, m + 1);


        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        long swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i]= scanner.nextInt();
        }

        long count = mergeSortAndCount(array,0,length-1);
        System.out.println(count);
    }


}
