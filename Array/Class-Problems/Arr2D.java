import java.util.Scanner;
import java.util.Arrays;
class Arr2D{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}