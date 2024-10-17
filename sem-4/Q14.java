import java.io.*;
import java.util.*;

public class Q14 {
    public static void main(String[] args) throws IOException{
        try{
            FileInputStream in = new FileInputStream("Q14t.txt");
            byte arr[] = new byte[100];

            System.out.println("Total available bytes :- " + in.available());
            in.read(arr);

            String data = new String(arr);
            System.out.println(data); 

            in.close();

            FileOutputStream out = new FileOutputStream("Q14t1.txt");
            Scanner scan = new Scanner(System.in);
            System.out.print("enter text you want to write in file:- ");
            String s = scan.nextLine();
            out.write(s.getBytes());
            scan.close();
            out.close();
            
            FileWriter wr = new FileWriter("Q14t.txt");
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