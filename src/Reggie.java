import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String mNum = "";
        String menu = "(O) Open | (S) Save | (V) View | (Q) Quit";
        String menuChoice = "";

        //Prompt & Input
        ssn = SafeInput.getRegExString(in, "What is your SSN?", "\\d{3}-\\d{2}-\\d{4}");
        mNum = SafeInput.getRegExString(in, "What is your M number?", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in, menu, "[OoSsVvQq]");

        //Output
        System.out.println("\nYour SSN is "+ssn+" and your M number is "+mNum);
    }
}
