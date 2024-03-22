import java.util.HashMap;

public class Account {

    private String username;
    private String password;
    private static HashMap<String, String> accountMap = new HashMap<>();

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        accountMap.put(username, password);
    }

    public void adopt(Pets pets){
        pets.adoptList.put(pets.name, username);
        pets.petsList.remove(pets);
        System.out.printf("a %s named %s has been adopted by %s\n",pets.animalType, pets.name, username);
        pets.ascii();
    }

    // getter and seter for username
    public String getusername() {
        return username;
    }
    public void setusername(String username) {
        this.username = username;
    }

    // getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static HashMap<String, String> getAccountMap() {
        return accountMap;
    }

    // set username and password
    public static void setAccountMap(String username, String password) {
        accountMap.put(username, password);
    }
}
