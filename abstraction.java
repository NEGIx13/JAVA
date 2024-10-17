public class abstraction {
    public static void main(String[] args){
        dog1 muku = new dog1();
        cat1 moni = new cat1();
        System.out.println(muku.eyes + " " + muku.legs);
        muku.eat();
        muku.walk();
        muku.run();
        moni.drink();
        moni.shit();
    }

}

// public abstact methods only
// public , static , final varialbles only
interface intf1 {
    void shit();
    void drink();
}

interface intf2{
    void eat();
    void run();
}


abstract class animal1{
    public int legs = 4;

    abstract void eat();

    void walk(){
        System.out.println("animal is walking");
    }
}

class dog1 extends animal1{
    public int eyes = 2;

    void eat(){
        System.out.println("dog is eating.");
    }
    void run(){
        System.out.println("dog is running");
    }
}


class cat1 implements intf2, intf1{
    public void shit(){
        System.out.println("cat is shitting");
    }

    public void drink(){
        System.out.println("cat is drinking");
    }

    public void eat(){

    }
    public void run(){

    }
}
