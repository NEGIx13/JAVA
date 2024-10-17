import java.util.*;

class Q1{
    public static void main(String[] args){
        rectangle r1 = new rectangle();
        r1.input();
        int area = r1.calcarea(r1.length, r1.breadth);
        r1.output(area);
    }
}

class rectangle{
    int length;
    int breadth;

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter length:- ");
        length = scan.nextInt();
        System.out.print("enter breadth:- ");
        breadth = scan.nextInt();
        scan.close();
    }

    void output(int area){
        System.out.println("total area:- " + area);
    }

    int calcarea(int a, int b){
        return a*b; 
    }
}
 