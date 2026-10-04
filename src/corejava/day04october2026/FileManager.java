package corejava.day04october2026;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileManager {
    public void openFile(String path) throws FileNotFoundException {
        FileReader file = new FileReader(path);
    }
}
