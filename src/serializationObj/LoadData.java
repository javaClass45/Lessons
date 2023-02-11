package serializationObj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileIS = new FileInputStream("d:/j1/save2.dat");
        ObjectInputStream objectIS = new ObjectInputStream(fileIS);

        SavedGame savedGame = (SavedGame) objectIS.readObject();

        objectIS.close();
        System.out.println(savedGame);


    }
}
