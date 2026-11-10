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
        String initial = getInitials(firstName);
        String email = studentNo + "@mycput.ac.za";
        String nameBlock = initial + " " + lastName;
        printSummary(nameBlock, studentNo, email);
    }
    private static int getValidStudentNumber(Scanner sc){
        Pattern pattern = Pattern.compile("\\d{9}");
        while(true){
                System.out.print("May you please enter your student number: ");
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
    public static String getInitials(String firstNames){
        if (firstNames.equals("")){
            return "";
        }
        else{
            StringBuilder initials = new StringBuilder();
            String [] parts = firstNames.split("\\s+");
            for(String part : parts){
                if(part.length() > 0){
                    char firstCharacter = Character.toUpperCase(part.charAt(0));
                    initials.append(firstCharacter);
                }
            }
            return initials.toString();
        }
    }
    public static void printSummary(String nameBlock, int studentNo, String email){
       System.out.printf("Initials and Surname: %s\n", nameBlock);
       System.out.printf("Student number: %d\n", studentNo);
       System.out.printf("Student email: %s\n", email);
    }
}
