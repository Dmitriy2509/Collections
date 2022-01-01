package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {
        UserObject userObject = new UserObject("Name", "Surname", "+380959482356", "some@gmail.com");
        Gson gson = new Gson();
        String user = gson.toJson(userObject);
        System.out.println(user);

        UserObject userObject2 = gson.fromJson(user, UserObject.class);
        System.out.println(userObject2);

        try {
            UserObject userObjectFromJson = gson.fromJson(new FileReader("./src/test/resources/user.json"), UserObject.class);
            System.out.println(userObjectFromJson);
            System.out.println(userObjectFromJson.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

/* Don't use like this It doesn't work
        try {
            UserObject userObjectToJson = new UserObject("NameToJson", "SurnameToJson", "+380959482356ToJson", "some@gmail.comToJsom");
            gson.toJson(userObjectToJson, new FileWriter("./src/test/resources/userToJson.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try (Writer writer = new FileWriter("./src/test/resources/userToJson.json")) {
            UserObject userObjectToJson = new UserObject("NameToJson", "SurnameToJson", "+380959482356ToJson", "some@gmail.comToJsom");
            Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
            gson2.toJson(userObjectToJson, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
