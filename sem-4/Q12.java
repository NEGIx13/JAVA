import java.util.*;

public class Q12 {
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter total number of people:- ");
        n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            try{
                System.out.print("enter age:- ");
                a[i] = scan.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println(e);
                System.out.println("wrong format");
            }
            catch(ArithmeticException e){
                System.out.println(e);
                System.out.println("operations not possible");
            }
            finally{
                System.out.println("final block called");
            }
        }
        scan.close();
    }
}
