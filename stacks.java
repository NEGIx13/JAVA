import java.util.Scanner;
import java.util.Stack;

public class stacks {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int choice;
        while(flag == 1){
            System.out.println("which funtion would you like to perform on the stack:- \n");
            System.out.println("1) push an element \n2) pop an element \n3) peek at the top element");
            System.out.println("4) print the stack \n5) exit program ");
            System.out.print("\n Your choice:- ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                System.out.print("enter the element to be pushed :- ");
//              int a = scan.nextInt();
                s.push(scan.nextInt());
                    break;
                
                case 2:
                System.out.print("popped elemnet :- " + s.pop() + "\n");
//                s.pop();
                    break;
                
                case 3:
                System.out.print("element at top of the stack :- " + s.peek() + "\n");
//                s.peek();
                    break;
                
                case 4:
                System.out.println("current stack :- " + s);
                    break;
                
                case 5:
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
