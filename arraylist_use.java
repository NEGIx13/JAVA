import java.util.*;

public class arraylist_use {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int choice;
        while(flag == 1){
            System.out.println("which funtion would you like to perform:- ");
            System.out.println("1) add an element \n2) remove an element \n3) update an element \n4) print all elements ");
            System.out.println("5) fetch an element \n6) add an elemnt to a specific location \n7) find and element \n8) exit program ");
            System.out.print("\n Your choice:- ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                System.out.print("enter the element to be added :- ");
//              int a = scan.nextInt();
                arr.add(scan.nextInt());
                    break;
                
                case 2:
                System.out.print("enter the index of the element to be removed :- ");
                arr.remove(scan.nextInt());
                    break;
                
                case 3:
                System.out.print("enter the index of the element to be updated :- ");
                int a = scan.nextInt();
                System.out.print("enter the value of the element to be updated :- ");
                arr.set(a, scan.nextInt());
                    break;
                
                case 4:
                System.out.println("current arraylist :- " + arr);
                    break;
                
                case 5:
                System.out.print("enter the index of the element to be feteched :- ");
                System.out.println(arr.get(scan.nextInt()));
                    break;

                case 6:
                System.out.print("enter the index of the element to be added :- ");
                int b = scan.nextInt();
                System.out.print("enter the value of the element to be added :- ");
                arr.add(b, scan.nextInt());
                    break;
                
                case 7:
                System.out.print("enter the value of the element you want to find :- ");
                int val = scan.nextInt();
                for(int i=0;i<arr.size();i++){
                    if(arr.get(i) == val){
                        System.out.println("element is found at index " + i + " !!!");
                        break;
                    }
                    else{
                        continue;
                    }
                }
                System.out.println("element not found :( .");

                    break;

                case 8:
                System.out.println("thank you for using the program :) .");
                flag--;
                    break;

                default:
                System.out.println("invalid option!! try again !! \n \n \n");
                    break;
            }
        }
        scan.close();
    }    
}
