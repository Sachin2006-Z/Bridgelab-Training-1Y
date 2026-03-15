package com.CreatingOfMethod.L2;
import java.util.*;
public class RandomNo {
    public static void avg(int[] a) {
        int x = 0;
        int y = 0;
        int c = 0;
        int[] b=new int[4];
        for (int i =0; i<4; i++) {
            b[i] = a[i];
        }
        for (int i=0; i<4; i++) {
            if (a[i]<a[y]) {
                a[y]=a[i];
            }
            if (a[i]>a[x]) {
                b[x]=a[i];
            }
            c+=a[i];
        }
        System.out.println("Minimun:"+a[y]);
        System.out.println("Maximun:"+b[x]);
        System.out.println("Avrage:"+ c/4);
    }

    public static void main(String[] args) {
        int[] a=new int[4];
        for(int i=0; i<4; i++){
            a[i]=(int)(Math.random()*10000)-1;
        }
        System.out.println(Arrays.toString(a));
        avg(a);
    }
}
