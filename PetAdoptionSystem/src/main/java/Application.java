import org.apache.commons.text.similarity.LevenshteinDistance;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Application {
  static Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args) {

    boolean isConnected = false;
    while (!isConnected) {
      System.out.println("Pet Adoption System" +
          "====================");
      System.out.println("Connect account\n1. Sign up\n2. sign in\n3. Exit");
      switch (keyboard.nextLine()) {
        case "1":
          if (!signUp()) {
            return;
          }
          break;
        case "2":
          if (!signIn()) {
            return;
          }
          break;
        case "3":
          return;
        default:
          System.err.println("Choose one of the given options");
          continue;
      }
      break;
    }
    while (true) {
      System.out.println("1. Search pet\n2. Animal care tips and FAQ\n3. Exit");
      switch (keyboard.nextLine()) {
        case "1":
          search();
          break;
        case "2":
        PetFAQ.FAQ();
          break;
        case "3":
          return;
        default:
          System.err.println("Choose one of the given options");
          continue;
      }
      break;
    }

  }

  public static boolean signUp() {
    while (true) {
      System.out.print("Enter username (Leave empty to exit):");
      String username = keyboard.nextLine();
      if (username.equals("")) {
        return false;
      }
      if (Account.getAccountMap().containsKey(username)) {
        System.err.println("Username already exists");
        continue;
      }
      
      while(true){
        System.out.println("Enter password (Leave empty to edit the username)");
      String password = keyboard.nextLine();
      if(password.equals("")){
        break;
      }

      // Check if password is null or less than 8 characters
      if (password == null || password.length() < 8) {
        System.err.println("Password must contain at least 8 characters.");
        continue;
      }

      // Regular expressions for lower case, upper case, and special character
      String lowerCaseChars = "(.*[a-z].*)";
      String upperCaseChars = "(.*[A-Z].*)";
      String specialChars = "(.[!\"#$%&'()+,-./:;<=>?@\\[\\]^_`{|}~].*)";

      // Check if password matches all the conditions
      if (!(Pattern.compile(lowerCaseChars).matcher(password).matches() &&
          Pattern.compile(upperCaseChars).matcher(password).matches() &&
          Pattern.compile(specialChars).matcher(password).matches())) {
          System.err.println("Password must contain at least a lowercase and an uppercase letter and a special character.");
          continue;
      }
      Account.setAccountMap(username, password);
      return true;
    }
    }
  }

  public static boolean signIn() {
    //Less memory used with byte datatype as it is only used for a very small range
    //Place it here to prevent it from being reset to 0 whenever the loop iterates
    byte passwordMisses = 0;

    while(true){
      System.out.print("Enter username (Leave empty to exit):");
      String username = keyboard.nextLine();
      if (username.equals("")) {
        return false;
      }
      if (!Account.getAccountMap().containsKey(username)) {
        System.err.println("Username does not exist.");
        continue;
      }
      while(true){
        System.out.println("Enter password (Leave empty to edit the username)");
      String password = keyboard.nextLine();
      if(password.equals("")){
        break;
      }
      
      if(!Account.getAccountMap().get(username).equals(password)){
        System.err.println("Incorrect password. "+passwordMisses+" attempt"+(passwordMisses>1?"s":"")+" left.");
        passwordMisses++;
        if(passwordMisses == 3){
          System.err.println("You have reached the maximum of 3 attempts allowed.");
          return false;
        }
        continue;
      }
      }
      return true;
    }
  }

  public static void search(){
    String i = keyboard.nextLine();

  }
}