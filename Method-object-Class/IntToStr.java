import java.util.Scanner;
class IntToStr{
    public int sum(int a, int b){
        int su=a+b;
        return su;
    }
    public String str(int a, int b){
        String sum=String.valueOf(a)+String.valueOf(b);
        return sum;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        IntToStr is=new IntToStr();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=is.sum(a,b);
        String d=is.str(a,b);
        System.out.println(c);
        System.out.println(d);
    }

}
