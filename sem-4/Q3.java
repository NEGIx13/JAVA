public class Q3 {

    static int num = 1;

    static{
        System.out.println("this is a static block.");
    }
    public static void main(String[] args) {
        Q3.method1();
        System.out.println("this is a static variable :- " + Q3.num);
    }

    static void method1(){
        System.out.println("this is a static method.");
    }
}
