import java.util.Scanner;
class Angle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x = input.nextInt();
int y = input.nextInt();
int z = input.nextInt();
int sumOfAngles = x + y + z;
System.out.println("The given angles " +x+ ", " +y+ ", " + z + " add to " + sumOfAngles);
if(sumOfAngles == 180){
    System.out.println("Its a Triangle");
}
else{
    System.out.println("Its not a Triangle");

}
}
}