import java.io.*;
import java.util.*;

public class Q14a {
    public static void main(String[] args) throws IOException{
        try{

            FileWriter wr = new FileWriter("Q14t1.txt");
            Scanner scan1 = new Scanner(System.in);
            System.out.print("enter text you want to write in file:- ");
            String s1 = scan1.nextLine();
            wr.write(s1);
            scan1.close();
            wr.close();

            FileReader re = new FileReader("Q14t1.txt");
            int cha;
            while((cha = re.read()) != -1){
                System.out.print((char)cha);
            }
            
            re.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}