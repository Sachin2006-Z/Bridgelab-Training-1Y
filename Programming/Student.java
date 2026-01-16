import java.util.Scanner;
class Student {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a,b,c=0,d,e;
        System.out.println("Enter the no. of pen");
        a= s.nextInt();
        System.out.println("Enter the no. of Students");
        b= s.nextInt();
        d= a%b;
        e=a/b;
        System.out.println("Remainder="+d);
        System.out.println("Questont="+e);

    }
    
}
