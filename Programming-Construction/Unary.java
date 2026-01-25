import java.util.Scanner;
class Unary{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Post Increment="+a++);
        System.out.println("Pre Increment="+ ++a);
        System.out.println("Post Decrement="+a--);
        System.out.println("Pre Decrement="+--a);

    }
}