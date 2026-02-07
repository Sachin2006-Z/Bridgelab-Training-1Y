import java.util.*;
class Cal{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mult(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int rem(int a,int b){
        return a%b;
    }
    public static void main(String args[]){
        Cal cl=new Cal();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your 2 numbers:-");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int a,b,c,d,e;
        a=cl.add(n1,n2);
        b=cl.sub(n1,n2);
        c=cl.mult(n1,n2);
        d=cl.div(n1,n2);
        e=cl.rem(n1,n2);
        System.out.println("Sum="+a+"\nSub="+b+"\nMultiple="+c+"\nDivisble="+d+"\n Remendar="+e);
    }
}