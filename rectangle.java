import java.util.*;

class rectangle{

    static int area(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        int length;
        int breadth;
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter length:- ");
        length = scan.nextInt();
        System.out.print("enter breadth:- ");
        breadth = scan.nextInt();
        
        a = area(length, breadth);
        System.out.println("total area :- " + a);

        scan.close();
    }
}

