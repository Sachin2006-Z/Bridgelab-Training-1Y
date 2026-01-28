import java.util.Scanner;
class Factorial{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),i,f=1;
        for(i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println("The factoria; of the number is= "+f);
    }
}