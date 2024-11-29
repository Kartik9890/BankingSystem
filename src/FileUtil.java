import java.io.*;
import java.util.List;

public class FileUtil {
    public static <T> void saveToFile(String filename, List<T> list) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
        }
    }

    public static <T> List<T> loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) ois.readObject();
        }
    }
}
