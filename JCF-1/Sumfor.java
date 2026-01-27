import java.util.Scanner;
class sumfor{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),c=0;
        double b=(a*(a+1))/2;
        for(int i=0; i<=a;i++){
            c+=i;
        }
       if(b==c){
            System.out.println("The sum of " +a+ " natural numbers is= "+b);
        }
        else{
            System.out.println("The sum is incorrect");
        }
    }
}