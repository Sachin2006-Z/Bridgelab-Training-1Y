import java.util.Scanner;
import java.util.Arrays;
class Sum2D{
    public static void main(String args[]){
        int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a2[][]={{3,2,4},{5,3,5},{7,1,9}};
        int r=a1.length;
        int c=a2[0].length;
        int d=0;
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                d=a1[i][j]+a2[i][j];
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}

