import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);

        scan.close();
    }
}

