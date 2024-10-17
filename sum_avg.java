import java.util.*;

public class sum_avg {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of the array:- ");
        int a = scan.nextInt(); 
        int[] arr = new int[a];
        int max = 0;
        float avg = 0;

        for(int i=0;i<a;i++){
            System.out.print("enter marks in subject " + (i+1) + " :- ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        System.out.print("all marks are :- ");
        for(int i=0;i<a;i++){
            System.out.print(arr[i] + "  ");
            if(arr[i] > max){
                max = arr[i];
            }
            avg += arr[i];
        }

        System.out.println("maximum marks :- " + max);
        avg = avg/a;
        System.out.println("average marks :- " + avg);
    }
}

