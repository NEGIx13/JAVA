import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int num1;
        int num2;
        Q17 obj = new Q17();
        
        System.out.print("enter first number:- ");
        num1 = scan.nextInt();

        System.out.print("enter second number:- ");
        num2 = scan.nextInt();
        

        while(flag != 0){
            int choice;
            System.out.print("which funtion would you like to perform :- \n 1) add \n 2) subtract \n 3) product \n 4) divide \n 5) exit \n your choice :- ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    obj.add(num1, num2);
                    break;
                case 2:
                    obj.minus(num1, num2);
                    break;
                case 3:
                    obj.multiply(num1, num2);
                    break;
                case 4:
                    obj.div(num1, num2);
                    break;
                case 5:
                    System.out.println("thank you for using this program");
                    flag--;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            } 
        }
        scan.close();
    }

    void add(int a, int b){
        System.out.println("sum of 2 numbers is :- " + (a+b));
    }

    void minus(int a, int b){
        System.out.println("subtraction of 2 numbers is :- " + (a-b));
    }

    void multiply(int a, int b){
        System.out.println("product of 2 numbers is :- " + (a*b));
    }

    void div(int a, int b){
        System.out.println("division of 2 numbers is :- " + (a/b));
    }
}

