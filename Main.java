import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/date/date.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini(file);
            ini.put("Options", "desc", "Описание изделия №1");
            ini.put("Options", "name", "изделие №1");
            ini.put("Options", "number", "12345");
            ini.put("Options", "value", "3,2");
            ini.store();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
