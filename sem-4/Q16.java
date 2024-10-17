import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.getdata();
        e1.showdata();
    }
}

class employee{
    String name;
    int age;
    String address;

    employee(){
        System.out.println("object created");
    }

    void getdata(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter name:- ");
        name = scan.nextLine();
        System.out.print("enter age:- ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("enter address:- ");
        address = scan.nextLine();
        scan.close();
    }

    void showdata(){
        System.out.println("details of students are as follows-");
        System.out.println("nam :- " + name);
        System.out.println("age :- " + age);
        System.out.println("address :- " + address);
    }
}
