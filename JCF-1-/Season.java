import java.util.Scanner;
class Season{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the month:- ");
        int a=s.nextInt();
        System.out.println("Enter the month date:- ");
        int b=s.nextInt();
        if(((a==3 && b>=20)||(a==4))||((a==5)||(a==6 && b<=20))){
            System.out.println("Its a Spring season");
        }
        else{
            System.out.println("Its not a Spring season");
        }
    }
}