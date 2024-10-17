public class Q6 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        derived obj = new derived();
    }
}

class base{
    base(){
        System.out.println("base class constructor called");
    }
}

class derived extends base{
    derived(){
        super();
        System.out.println("derived class constructor called");
    }
}