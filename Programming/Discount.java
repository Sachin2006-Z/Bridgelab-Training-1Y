import java.util.Scanner;
 public class Discount{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the fee:-");
        double f=sc.nextDouble();
        double a= (10*f)/100;
        double b= f-a; 
        System.out.println("Discount="+a);
        System.out.println("Discount Price ="+b);
    }
}
    

