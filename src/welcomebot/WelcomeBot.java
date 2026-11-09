package welcomebot;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WelcomeBot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi! May you please enter your first name(s): ");
        String firstName = sc.nextLine();
        System.out.print("May you please enter your last name: ");
        String lastName = sc.nextLine();
    }
    
}
