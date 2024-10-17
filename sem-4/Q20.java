public class Q20 {
    public static void main(String[] args) {
        MyNameRunnable firstThread = new MyNameRunnable();
        HelloJavaRunnable secondThread = new HelloJavaRunnable();
        

        Thread thread1 = new Thread(firstThread);
        Thread thread2 = new Thread(secondThread);
        Thread thread3 = new dyem();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyNameRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My name is JACK.");
    }
}

class HelloJavaRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Java.");
    }
}

class dyem extends Thread{
    public void run(){
        System.out.println("this is thread class");
    }
}
