package stream_imput_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        String str2 = " World!";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D://test.txt", true);
            byte[] buffer = str.getBytes();
            fileOutputStream.write(buffer);
            buffer = str2.getBytes();
            fileOutputStream.write(buffer);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
