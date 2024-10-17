import java.util.*;

public class queue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);

        System.out.println(queue);

        System.out.println(queue.getFirst());

        queue.removeFirst();
        System.out.println(queue);
        scan.close();

    }
    
}
