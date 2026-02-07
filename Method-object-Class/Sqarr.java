import java.util.*;
import java.util.Arrays;
class Sqarr{
    public int Sq(int arr[n]){
        for(int i=0; i<arr.length; i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Sqarr sr=new Sqarr();
        System.out.println("Enter the lenght of Array");
        int n=s.nextInt();
        int b=sr.sq(n);
        System.out.println(Arrays.toString);


    }
}