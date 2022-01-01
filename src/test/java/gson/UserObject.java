package gson;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class UserObject implements Serializable {
    private String name;
    private String surname;
    private String phone;
    private String email;

    public UserObject(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserObject{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
