import java.util.ArrayList;

public class Account{
  
  private String username;
  private String password; 
  private String ID; 
  private static ArrayList<Account> accounts = new ArrayList<Account>();
  
  public Account(String username, String password) {
    this.username = username;
    this.password = password;
    this.ID = incrementId();
    accounts.add(this);
    }
    // Getter for username
    public String getusername() {
        return username;
    }
    // Setter for username
    public void setusername(String username) {
        this.username = username;
    }
    // Getter for password
    public String getPassword() {
        return password;
    }
    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
    // Getter for ID
    public String getID() {
        return ID;
    }
    // Setter for ID
    public void setMemberNum(String ID) {
        this.ID = ID;
    }
  
    public String incrementId() {
        String ID = accounts.get(accounts.size() - 1).getID();
      
        String letters = ID.substring(0, 2);
        String numbers = ID.substring(2);
        int num = Integer.parseInt(numbers);
        num++;
        if (num > 9999) {
            num = 0;
            char lastLetter = letters.charAt(1);
            lastLetter++;
            if (lastLetter > 'Z') {
                lastLetter = 'A';
                char firstLetter = letters.charAt(0);
                firstLetter++;
                if (firstLetter > 'Z') {
                    firstLetter = 'A';
                }
                letters = "" + firstLetter + lastLetter;
            } else {
                letters = "" + letters.charAt(0) + lastLetter;
            }
        }
        numbers = String.format("%04d", num);
        ID = letters + numbers;
    }

}

