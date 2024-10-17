import java.util.*;

public class max_nums{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter value of x:- ");
        int x = scan.nextInt();

        System.out.print("enter value of y:- ");
        int y = scan.nextInt();

        System.out.print("enter value of z:- ");
        int z = scan.nextInt();
        scan.close();
        if(x>y && x>z){
            System.out.println(x + " is the largest number.");
        }
        else if(y>x && y>z){
            System.out.println(y + " is the largest number.");
        }
        else{
            System.out.println(z + " is the largest number.");
        }
    }
}
