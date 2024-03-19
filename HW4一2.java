package chatbot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW4一2 {
    public static void main(String[] args) {
        Path filePath = Path.of("C:\\Users\\User\\Desktop\\HW4\\chatbot\\bin\\chatbot\\demo.txt");
        try {
            String content = Files.readString(filePath);
            Pattern pattern = Pattern.compile("01AF0055/\\d{6}[a-z]\\.HRV\\.jpg\\?HRV\\.bpp"); // 匹配指定的 HRV.jpg 檔案
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                String filename = matcher.group();
                System.out.println(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
