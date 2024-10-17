import java.util.Scanner;

public class custom_exception {
    public static void main(String args[]){
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter age:- ");
        age = scan.nextInt();
        scan.close();
        try{
            if(age < 18){
                throw new votel();
            }
        }
        catch(votel ex){
                System.out.println(ex);
            }
        }
}
    

class votel extends Exception{
    votel(){
        super("age less than 18 bro.");
    }
}
