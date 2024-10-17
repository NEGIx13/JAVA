import java.io.*;

public class Q18 {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("STOP")) {
                System.out.println("You typed: " + line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
