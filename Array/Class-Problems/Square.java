import java.util.Scanner;
import java.util.Arrays;

public class Square {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = s.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            arr[i]=arr[i]*arr[i];
        }

        System.out.println("Printing an Array using toString:");
        System.out.println(Arrays.toString(arr));
    }
}
