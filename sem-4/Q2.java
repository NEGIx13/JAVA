public class Q2 {
    public static void main(String[] args) {
        calculations c1 = new calculations();

        System.out.print("area of square :- ");
        c1.area(10);

        System.out.print("area of rectangle :- ");
        c1.area(10, 20);

        System.out.print("area of triangle:- ");
        c1.area(0.5, 10, 15);
    }
}

class calculations {
    void area(int length, int breadth){
        System.out.println(length*breadth);
    }

    void area(int side){
        System.out.println(side*side);
    }

    void area(double half, int base, int height){
        System.out.println(half*base*height);
    }
}