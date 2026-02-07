import java.util.Scanner;
import java.util.Arrays;
class SqOf2D{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=arr.length;
        int c=arr[0].length;
        int d=0;
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                d=arr[i][j]*arr[i][j];
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}