package Java_tasks.printStream_printWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printStream {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "Lol kek";
        FileOutputStream fileOutputStream = new FileOutputStream("D://test.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);
        printStream.println(str);
        printStream.print("Lok down ");
        printStream.println("help me!");
        printStream.printf("Name: %s - Age: %d \n", "Ivan", 24);
    }
}
