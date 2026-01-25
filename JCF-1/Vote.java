import java.util.Scanner;
class Vote{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your age");
        int a=s.nextInt();
        if (a>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can not vote");
        }
    }
}