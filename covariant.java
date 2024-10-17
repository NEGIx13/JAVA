public class covariant {
    public static void main(String[] args){
        new A1().foo().print();
        new A2().foo().print();
        new A3().foo().print();
    }
}

class A1{
    A1 foo(){
        return this;
    }

    void print(){
        System.out.println("we are in A1 block");
    }
}

class A2 extends A1{
    A1 foo(){
        return this;
    }

    void print(){
        System.out.println("we are in A2 block");
    }
}

class A3 extends A2{
    A1 foo(){
        return this;
    }

    void print(){
        System.out.println("we are in A3 block");
    }
}
