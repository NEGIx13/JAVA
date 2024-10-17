public class Q7 {
    public static void main(String[] args) {
        level1 obj1 = new level2();
        level1 obj2 = new level1();

        obj1.print();
        obj2.print();
    }
}

class level1{
    void print(){
        System.out.println("this is first level");
    }
}

class level2 extends level1{
    void print(){
        System.out.println("this is second level (runtime poly)");
    }
}
