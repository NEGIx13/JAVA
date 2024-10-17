import java.util.Scanner;

class ChildThread extends Thread {
    public void run() {
        System.out.println("Child Thread " + Thread.currentThread()+ " is running");
    }
}

public class Q13 {
    public static void main(String[] args) {

        int numThreads;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter total number of threads you want to make:- ");
        numThreads = scan.nextInt();
        scan.close();
        
        for (int i = 0; i < numThreads; i++) {
            ChildThread child = new ChildThread();
            child.start();
        }
        System.out.println("Main Thread is exiting");
    }
}
