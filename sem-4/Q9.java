public class Q9 {
    public static void main(String[] args) {
        student obj1 = new student("sam", 19);
        obj1.print();
    }
}

class student extends sports{
    String name;
    int age;

    student(String n, int a){
        name = n;
        age = a;
    }

    final void print(){
        System.out.println("name :- " + name);
        System.out.println("age :- " + age);
        System.out.println("total activities :- " + total_activities);
    }
}

abstract class sports{
    int total_activities = 10;
    sports(){
        System.out.println("we are in sports abstract class");
    }
}
