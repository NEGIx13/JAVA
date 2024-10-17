import java.util.*;

public class array {

    public static void edit(int[] arr){
        arr[2] = 32;
        arr[4] = 69;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of the array:- ");
        int a = scan.nextInt(); 
        int[] arr = new int[a];

        for(int i=0;i<a;i++){
            System.out.print("enter elment number " + (i+1) + " :- ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("the array is:- ");
        for(int i=0;i<a;i++){
            System.out.print(arr[i] + "  ");
        }

        edit(arr);

        System.out.println("\n array after edit ");
        for(int i=0;i<a;i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
