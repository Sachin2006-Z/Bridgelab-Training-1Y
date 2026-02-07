import java.util.Scanner;
import java.util.Arrays;

public class Sum3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = s.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Array: ");
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number to find sum in Array: ");
        int b=s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==b){
                        System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+b);
                    }
                }
            } 
        }
    }
}
