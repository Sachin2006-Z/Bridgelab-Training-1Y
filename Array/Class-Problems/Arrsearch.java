import java.util.Scanner;
import java.util.Arrays;

public class Arrsearch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = s.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the number to Search :- ");
	
	int a=s.nextInt();
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==a)

	{
			System.out.println(a);
			}
	}
    }
}
