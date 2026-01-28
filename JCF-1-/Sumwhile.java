import java.util.Scanner;
class sumwhile{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),c=0;
        double b=(a*(a+1))/2;
        while(a>0){
            c+=a;
            a-=1;
        }
        if(b==c){
            System.out.println("The sum of " +a+ " natural numbers is= "+b);
        }
        else{
            System.out.println("The sum is incorrect");
        }
    }
}