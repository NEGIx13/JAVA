public class Q4 {
    public static void main(String[] args) {
        student s1 = new student("jack", 19);
        System.out.println("name of student :- " + s1.name);
        System.out.println("age of student:- " + s1.age);
    }
}

class student{
    String name;
    int age;
    
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
