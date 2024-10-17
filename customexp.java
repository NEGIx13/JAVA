import java.util.*;

public class customexp {
    public static void main(String[] args) throws age_limit{
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter age:- ");
        n = scan.nextInt();
        try{
            if(n <= 18){
                throw new age_limit();
            }
        }
        catch(age_limit e){
            System.out.println(e);
        }
    }
}

class age_limit extends Exception{
    age_limit(){
        super("age less than 18 bro.");
    }
}

