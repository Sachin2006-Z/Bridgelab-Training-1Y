import java.util.Scanner;
class Logic{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>20&&b>20){
            System.out.println("Both Bigger Then 20");
        }
        else if(a<20&&b<20){
            System.out.println("Both smaller Then 20");
        }
        if(a>20||b>20){
            System.out.println("One is Bigger Then 20");
        }
    }
}