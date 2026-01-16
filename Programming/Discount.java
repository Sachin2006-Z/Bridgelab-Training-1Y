import java.util.Scanner;
class Discount{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the fee:-");
        double f=s.nextDouble();
        double a= (10*f)/100;
        double b= f-a; 
        System.out.println("Discount="+a);
        System.out.println("Discount Price="+b);

    }
    
}
    

