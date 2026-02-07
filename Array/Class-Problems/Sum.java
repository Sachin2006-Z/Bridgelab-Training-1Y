import java.util.Scanner;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = s.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
	    {
            sum+=arr[i];
	    }
	    System.out.println("sum of array :- "+ sum);
    }
}
