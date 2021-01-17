package task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("file1.txt");
        Animal animal = new Animal("Pushok", "white", 5);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(animal);
        oos.flush();
        oos.close();
    }
}
