package stream_imput_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class fileInputStream {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("D://test.txt");
            byte[] buffer = fileInputStream.readAllBytes();
            String content = new String(buffer, StandardCharsets.UTF_8);
            System.out.println(content);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
