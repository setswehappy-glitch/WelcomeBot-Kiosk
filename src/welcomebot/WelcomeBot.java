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
        int studentNo = getValidStudentNumber(sc);
    }
    private static int getValidStudentNumber(Scanner sc){
        Pattern pattern = Pattern.compile("//d{9}");
        while(true){
                System.out.print("May you please enter your student number:");
                String input = sc.nextLine();
                
                try{
                   int studentNumber = Integer.parseInt(input);
                   Matcher matcher = pattern.matcher(input);
                   if(matcher.matches()){
                       return studentNumber;
                   }
                   else{
                       System.out.println("Error! Please try again.");
                   }
                }
                catch(NumberFormatException e){
                    System.out.println("Please let you input be of number format only. Thank you!");
                }
        }
    }
}
