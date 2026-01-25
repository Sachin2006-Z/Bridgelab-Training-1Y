import java.util.Scanner;
class Positive{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to check weither its positive or negative");
        int a=s.nextInt();
        if (a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Your number is Zero ");
        }
    }
}