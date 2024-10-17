import java.util.*;


public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        // add
        list.add(10);
        list.add(20);
        list.add(30);

        // insert
        list.add(1, 15);

        //update
        list.set(1, 16);

        //taking value
        int val = list.get(1);
        System.out.println(val);

        //removing value
        list.remove(1);
        
        System.out.println(list + " -> " + list.size());
    }
}
