import java.util.*;
class Add{
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Add cl=new Add();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your 2 numbers:-");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int a;
        a=cl.add(n1,n2);
        System.out.println("Sum="+a);
    }
}