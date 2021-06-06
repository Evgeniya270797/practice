package algoriphSort;



import java.util.Arrays;
import java.util.Scanner;

public class Task {

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
