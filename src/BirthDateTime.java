import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        //Prompt & Input
        year = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2010);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        if (month==2) {
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 28);}
        else if (month==4 || month==6 || month==9 || month==11) {
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);}
        else{
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);}
        hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        //Output
        System.out.println("\nYou were born on " + month + "/" + day + "/" + year + " at "+hours+":"+minutes);
    }
}
