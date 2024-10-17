import java.io.*;

public class checked_throws {
    public static void main(String args[])throws FileNotFoundException, IOException{
        try{
        File ff = new File("check1.txt");
        
        FileInputStream fs = new FileInputStream(ff);
        fs.close();
        }
        catch(FileNotFoundException ex){
           System.out.println(ex);
           System.out.println("file not found :) ");
        }
    }
}
