import java.util.*;
class ITS{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum= a+b;
        String su=String.valueOf(a)+String.valueOf(b);
        System.out.println(sum+ " " + su);
    }
}