public class Q5 {
    public static void main(String[] args) {
        actions obj1 = new actions("moku", 8);

        obj1.deets();
        obj1.bark();
        obj1.eat();
        obj1.drink();
    }
}

class animal{
    String name;
    int age;

    animal(String s1, int age){
        name = s1;
        this.age = age;
    }

    void deets(){
        System.out.println("(multilevel)");
        System.out.println("the name of the animal is:- " + name);
        System.out.println("the age of the animal is:- " + age);
    }
}

class dog extends animal{
    dog(String s1, int age) {
        super(s1, age);
    }

    void bark(){
        System.out.println("dog braks. (hierarchical)");
    }
}

class actions extends dog{
    actions(String s1, int age) {
        super(s1, age);
    }

    void drink(){
        System.out.println("dog drinks. ");
    }

    void eat(){
        System.out.println("dog eats.");
    }
}