import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner kybrd = new Scanner(System.in);
    System.out.println("Please type your chosen username: ");
    String username = kybrd.nextLine();
    int uLength = username.length();

    if (uLength > 6 && uLength < 15) {
      if (Character.isUpperCase(username.charAt(0)))
      {
        System.out.println("Username: " + username);

        System.out.println("Please type your chosen password: ");
        String password = kybrd.nextLine();
        int pLength = password.length();

       

        if (pLength > 8 && pLength < 256){
          if(password != null){
            for(int i = 0; i < password.length(); i++){
              if(Character.isWhitespace(password.charAt(i))){
                 System.out.println("Choose a password without spaces");
              }
              if(!Character.isWhitespace(password.charAt(i))){
                 System.out.println("Password: *****");
                 break;
              }
              
            }
          }
        }
        else {System.out.println("Choose a password between 8-256 characters."); 
        }
      }
      
      else 
      {System.out.println("Your username needs to begin with a capital letter.");
      }
    }
    else {
      System.out.println("Your password needs to be longer.");
    }


    
  
    
 
  }
}
