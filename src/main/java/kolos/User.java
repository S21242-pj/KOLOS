package kolos;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class User {

    private String userFirstName;
    private String userLastName;
    private int userId;

    public User(String userFirstName, String userLastName, int userId) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userId = userId;
    }

    public User(){
    }

    /**
     *  Musiałem dodać gettery jeszcze raz, ponieważ lombok mi nie łapał w mainie jak chciałem pobrać wartości.
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public int getUserId() {
        return userId;
    }
}
