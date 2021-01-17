package task2;

import task1.Animal;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1.txt"));
        Animal newAnimal = (Animal) ois.readObject();
        System.out.println(newAnimal.getName() + " " + newAnimal.getColor() + " " + newAnimal.getAge());
    }
}
