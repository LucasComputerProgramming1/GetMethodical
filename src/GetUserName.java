import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        //Prompt & Input
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        //Output
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}

