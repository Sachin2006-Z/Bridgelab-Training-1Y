import java.util.Scanner;
class Assignment{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a=s.nextInt();
        a+=a;
        System.out.println("Sum="+a);
        a-=7;
        System.out.println("Sub="+a);
        a*=2;
        System.out.println("Mult="+a);
    }
}