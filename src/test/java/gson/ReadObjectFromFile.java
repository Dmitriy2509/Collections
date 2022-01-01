package gson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("user.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            UserObject userObject = (UserObject) objectInputStream.readObject();
            UserObject userObject2 = (UserObject) objectInputStream.readObject();
            System.out.println(userObject);
            System.out.println(userObject2);
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
