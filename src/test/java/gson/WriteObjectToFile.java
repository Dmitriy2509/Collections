package gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {

    public static void main(String[] args) {

        UserObject userObject = new UserObject("Name", "Surname", "+5252", "q@gmail.com");
        UserObject userObject2 = new UserObject("Name2", "Surname2", "+5252", "s@gmail.com");
        try {
            FileOutputStream fos = new FileOutputStream("user.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

            objectOutputStream.writeObject(userObject);
            objectOutputStream.writeObject(userObject2);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
