public class Q10 {
    public static void main(String[] args) {
        student s1 = new student();
        teacher t1 = new teacher();

        s1.print();
        t1.print();
    }
}

class teacher implements intf_4{
    public void print(){
        System.out.println("student age :- " + age);
    }
}

class student implements intf_3{
    public void print(){
        System.out.println("teacher age :- " + age);
    }
}

interface intf_3 {
    static int age = 15;
    void print();
}

interface intf_4 {
    static int age = 30;
    void print();
}
