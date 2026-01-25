import java.util.Scanner;
class Digitsum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a,b,c=0,d;
        a=s.nextInt();
            while(a>0){
            b=a%10;
            c=c+b;
            a=a/10;        
        }
        System.out.println("The sum of the digits are = "+c);
    }
}
