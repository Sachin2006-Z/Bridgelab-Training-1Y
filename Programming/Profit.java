import java.util.Scanner;
class Profit{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Selling Price");
        a=sc.nextInt();
        System.out.println("Cost Price");
        b=sc.nextInt();
        c=a-b;
        double d=(a*100)/b;
        System.out.println("Profit="+c);
        System.out.println("Profit Precent="+d);
    }
} 
    

