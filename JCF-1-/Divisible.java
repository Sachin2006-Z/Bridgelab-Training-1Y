import java.util.Scanner;
class Divisible{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=s.nextInt();
        if(a%5==0){
            System.out.println("Your number is Divisible by 5 ");
        }
        else{
            System.out.println("Your number is not Divisible by 5 ");

        }
    }
}