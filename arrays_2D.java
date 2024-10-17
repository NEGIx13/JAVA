import java.util.*;

public class arrays_2D{

    public static void jagged(int[][] arr, Scanner scan){
        for(int i=0;i<arr.length;i++){
                System.out.print("enter dimention size of the 2D array in index [" + i + "]:- ");
                int j = scan.nextInt();
                arr[i] = new int[j];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("enter element in index [" + i + "][" + j + "] :- ");
                arr[i][j] = scan.nextInt();
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter 1st dimention size of the 2D array:- ");
        int n = scan.nextInt();
        System.out.print("enter 2nd dimention size of the 2D array :- ");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("enter element in index [" + i + "][" + j + "] :- ");
                arr[i][j] = scan.nextInt();
            }
        }

        print(arr);
        System.out.print("\n enter 1st dimention size of the 2D array jagged :- ");
        n = scan.nextInt();
        int[][] jagged = new int[n][];
        jagged(jagged, scan);
        print(jagged);

        scan.close();
    }

    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(" \n element in index [" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
