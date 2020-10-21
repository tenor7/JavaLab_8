import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("D:\\notes.txt", false))
        {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();

            // запись всей строки
            writer.write(s);
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}