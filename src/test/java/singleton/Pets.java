package singleton;

import lombok.Data;

@Data
public class Pets {
   private String nickName;

    private Pets() {
    }

    private static Pets pets;

    //singleton
    public static Pets petSingleton() {
        if (pets == null) {
            pets = new Pets();
        }
        return pets;
    }


}
