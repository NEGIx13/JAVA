public class superkey {
    public static void main(String[] args){
        dog d = new dog();

        d.printc();
        d.eat();
    }
}

class animal{
    String color = "white";

    animal(){
        System.out.println("animal class invoked.");
    }

    void eat(){
        System.out.println("animal is eating. ");
    }
}

class dog extends animal{
    String color = "blue";

    dog(){
        super();
        System.out.println("dog class invoked");
    }

    void printc(){
        System.out.println(super.color); // white
        System.out.println(color); // blue
        ;
    }

    void eat(){
        super.eat();
        System.out.println("dog is eating");
    }
}
