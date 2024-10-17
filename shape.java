// import java.util.*;

interface polygon{
    void getArea();
    void getperimeter();
}

class triangle implements polygon{
    public void getArea(){}
    public void getperimeter(){}
    public void getperimeter(int a, int b, int c){
        System.out.println("triangle perimeter:- " + (a+b+c));
    
    }

    public void getArea(int base, int height){
        System.out.println("triangle area:- " + (0.5 * base * height));
    }
}

class rectangle implements polygon{
    public void getArea(){}
    public void getperimeter(){}
    public void getArea(int base, int height){
        System.out.println("rectangle area:- " + (base * height));
    }

    public void getperimeter(int l, int b){
        System.out.println("rectangle perimeter:- " + 2*(l+b));
    }
}

class pentagon implements polygon{
    public void getArea(){}
    public void getperimeter(){}
    public void getArea(int side){
        System.out.println("pentagon area:- " + (side*side*side));
    }

    public void getperimeter(int a, int b, int c, int d, int e){
        System.out.println("pentagon perimeter:- " + (a+b+c+d+e));
    }
}

class shape {
    public static void main(String args[]){
        triangle t = new triangle();
        rectangle r = new rectangle();
        pentagon p = new pentagon();
        
        t.getArea(10, 20);
        t.getperimeter(5,10,15);
        
        r.getArea(10, 20);
        r.getperimeter(10,15);
        
        p.getArea(10);
        p.getperimeter(5,10,15,20,25);
    }
}


