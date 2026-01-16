import java.util.Scanner;
public class Avg {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Chemistry=");
        a= s.nextInt();
        System.out.print("\n Pysics=");
        b= s.nextInt();
        System.out.print("\n Pysics=");
        c= s.nextInt();
        d= (a+b+c)/3;
        System.out.println(+d);
    }
    
}
