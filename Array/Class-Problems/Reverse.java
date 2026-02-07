import java.util.Scanner;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = s.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Reverse the Array :- ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
    }
}
