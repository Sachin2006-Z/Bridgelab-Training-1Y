import java.util.Scanner;
class HCF{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int t=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                t=i;
            }
        }
        System.out.println(t);
    }
}