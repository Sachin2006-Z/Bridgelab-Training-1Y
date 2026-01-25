import java.util.Scanner;
class Factorial{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),i,f=1;
        while(a>0){
            f=f*a;
            a-=1;
        }
        System.out.println("The factoria; of the number is= "+f);
    }
}